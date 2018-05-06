package br.com.faesa.app.dao

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import br.com.faesa.app.domain.Company


/**
 * Created by wiliam on 5/6/18.
 */
class CompanyDAO(context: Context) : BaseDAO<Company>(context) {
    override val table: String = DB.COMPANY.TABLE_NAME

    override fun cursorToEntity(c: Cursor): Company {
        val id = c.getLongColumn(DB.COLUMN_ID)
        val name = c.getStringColumn(DB.COMPANY.COLUMN_NAME)
        val description = c.getStringColumn(DB.COMPANY.COLUMN_DESCRIPTION)

        return Company(id, name, description)
    }

    override fun entityToContentValues(entity: Company): ContentValues {
        val cv = ContentValues()

        cv.put(DB.COMPANY.COLUMN_NAME, entity.name)
        cv.put(DB.COMPANY.COLUMN_DESCRIPTION, entity.description)

        return cv
    }

}