package br.com.faesa.app.dao

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import br.com.faesa.app.domain.Entity

import java.util.ArrayList

abstract class BaseDAO<E : Entity>
(context: Context) : SQLiteOpenHelper(context, DATABASE, null, VERSION) {

    companion object {
        const val DATABASE = "database"
        const val VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase) {
        val createTables = StringBuilder()

        try {
            createTables.append(DB.COMPANY.CREATE_TABLE)
            createTables.append(DB.CAREER.CREATE_TABLE)
            createTables.append(DB.COMPANY_CAREER.CREATE_TABLE)
        } catch (e: BuildException) {
            Log.e("ERROR", "Algo de errado nao deu certo")
        }

        db.execSQL(createTables.toString())
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {

    }
    /* CONTRACT */
    protected abstract fun cursorToEntity(c: Cursor): E

    protected abstract fun entityToContentValues(entity: E): ContentValues

    protected abstract val table: String

    /* CRUD - CREATE */
    fun insert(entity: E) {
        entity.id = writableDatabase.insert(table, null, entityToContentValues(entity))
    }

    fun insert(entitys: List<E>) {
        entitys.forEach {
            writableDatabase.insert(table, null, entityToContentValues(it))
        }
    }

    /* CRUD - READ */
    val list: List<E>
        get() {
            val c = readableDatabase.rawQuery("SELECT * FROM " + table, null)
            return cursorToEntitys(c)
        }

    /* CRUD - READ */
    operator fun get(id: Int): E? {
        val db = readableDatabase
        var retorno: E? = null
        var c: Cursor?

        try {
            c = db.rawQuery("SELECT * FROM $table WHERE id=?;", arrayOf(id.toString() + ""))
            if (c!!.moveToNext()) {
                retorno = cursorToEntity(c)
            }
        } finally {
            c = null
        }

        return retorno
    }

    /* CRUD - UPDATE */
    fun update(entity: E) {
        val cv = entityToContentValues(entity)
        cv.put("id", entity.id)
        writableDatabase.update(table, cv, DB.COLUMN_ID + " = ?", arrayOf(entity.id.toString() + ""))
    }

    /* CRUD - DELETE */
    fun delete(entity: E) {
        writableDatabase.delete(table, DB.COLUMN_ID + " = ?", arrayOf(entity.id.toString() + ""))
    }

    /* ACTIONS AUXILIARYS */
    fun save(entity: E) {
        if (entity.id > 0) {
            update(entity)
        } else {
            insert(entity)
        }
    }

    /* OUTHERS */
    private fun cursorToEntitys(c: Cursor): List<E> {
        val list = ArrayList<E>()
        while (c.moveToNext()) {
            list.add(cursorToEntity(c))
        }
        return list
    }
}

fun Context.deleteAppDatabase() {
    this.deleteDatabase(BaseDAO.DATABASE)
}

fun Cursor.getLongColumn(column : String) : Long {
    return this.getLong(this.getColumnIndex(column))
}

fun Cursor.getStringColumn(column : String) : String {
    return this.getString(this.getColumnIndex(column))
}