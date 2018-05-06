package br.com.faesa.app.dao

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import br.com.faesa.app.domain.Career

/**
 * Created by wiliam on 5/6/18.
 */
class CareerDAO(context: Context) : BaseDAO<Career>(context) {
    override val table: String = DB.CAREER.TABLE_NAME

    override fun cursorToEntity(c: Cursor): Career {
        val id = c.getLongColumn(DB.COLUMN_ID)
        val name = c.getStringColumn(DB.CAREER.COLUMN_NAME)
        val description = c.getStringColumn(DB.CAREER.COLUMN_DESCRIPTION)

        return Career(id, name, description)
    }

    override fun entityToContentValues(entity: Career): ContentValues {
        val cv = ContentValues()

        cv.put(DB.CAREER.COLUMN_NAME, entity.name)
        cv.put(DB.CAREER.COLUMN_DESCRIPTION, entity.description)

        return cv
    }

}