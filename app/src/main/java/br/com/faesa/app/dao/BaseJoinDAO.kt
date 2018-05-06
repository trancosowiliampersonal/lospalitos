package br.com.faesa.app.dao

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import br.com.faesa.app.domain.EntityJoin

/**
 * Created by wiliam on 5/6/18.
 */
abstract class BaseJoinDAO<E : EntityJoin>
(context: Context) : SQLiteOpenHelper(context, BaseDAO.DATABASE, null, BaseDAO.VERSION) {

    override fun onCreate(db: SQLiteDatabase?) {
        throw Exception("NAO DEVERIA")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        throw Exception("NAO DEVERIA")
    }

    /* CONTRACT */
    protected abstract fun cursorToEntity(c: Cursor): E

    protected abstract fun entityToContentValues(entity: E): ContentValues

    protected abstract val table: String

    fun insert(entity: E){
        writableDatabase.insert(table, null, entityToContentValues(entity))
    }

    fun insert(vararg entitys: E) {
        entitys.forEach {
            writableDatabase.insert(table, null, entityToContentValues(it))
        }
    }
}