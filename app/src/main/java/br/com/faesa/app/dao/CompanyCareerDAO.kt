package br.com.faesa.app.dao

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import br.com.faesa.app.domain.CompanyCareer

/**
 * Created by wiliam on 5/6/18.
 */
class CompanyCareerDAO(context: Context) : BaseJoinDAO<CompanyCareer>(context) {

    override val table = DB.COMPANY_CAREER.TABLE_NAME

    override fun cursorToEntity(c: Cursor): CompanyCareer {
        val idCompany = c.getLongColumn(DB.COMPANY_CAREER.COLUMN_ID_COMPANY)
        val idCareer = c.getLongColumn(DB.COMPANY_CAREER.COLUMN_ID_CAREER)

        return CompanyCareer(idCompany, idCareer)
    }

    override fun entityToContentValues(entity: CompanyCareer): ContentValues {
        val cv = ContentValues()

        cv.put(DB.COMPANY_CAREER.COLUMN_ID_COMPANY, entity.idCompany)
        cv.put(DB.COMPANY_CAREER.COLUMN_ID_CAREER, entity.idCareer)

        return cv
    }


}