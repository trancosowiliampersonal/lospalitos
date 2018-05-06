package br.com.faesa.app.dao

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

import java.util.ArrayList

abstract class BaseDAO<E : Entity>/* CONSTRUCTORS */
(context: Context) : SQLiteOpenHelper(context, "database", null, 1) {

    /* CONTRACT */
    protected abstract fun cursorToEntity(c: Cursor): E

    protected abstract fun entityToContentValues(entity: E): ContentValues

    protected abstract val table: String

    /* CRUD - CREATE */
    fun insert(entity: E) {
        entity.id = writableDatabase.insert(table, null, entityToContentValues(entity))
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