package br.com.faesa.app.dao

/**
 * Created by wiliam on 5/5/18.
 */

object DB {
    val COLUMN_ID = "ID"


    object COMPANY {

        val TABLE_NAME = "COMPANY"
        val COLUMN_NAME = "COM_TXT_NAME"
        val COLUMN_DESCRIPTION= "COM_TXT_DESCRIPTION"

        val CREATE_TABLE: String =  CreatorTable(TABLE_NAME, COLUMN_ID, mapOf(
                    COLUMN_NAME to CreatorTable.Type.TEXT,
                    COLUMN_DESCRIPTION to CreatorTable.Type.TEXT
            )).makeCreateQuery()
    }

    object CAREER {

        val TABLE_NAME = "CAREER"
        val COLUMN_NAME = "CAR_TXT_NAME"
        val COLUMN_DESCRIPTION= "CAR_TXT_DESCRIPTION"

        val CREATE_TABLE: String = CreatorTable(TABLE_NAME, COLUMN_ID, mapOf(
                COLUMN_NAME to CreatorTable.Type.TEXT,
                COLUMN_DESCRIPTION to CreatorTable.Type.TEXT
        )).makeCreateQuery()
    }

    object COMPANY_CAREER {

        val TABLE_NAME = "COMPANY_CAREER"
        val COLUMN_ID_COMPANY = "ID_COMPANY"
        val COLUMN_ID_CAREER= "ID_CAREER"

        val CREATE_TABLE: String = CreatorTable(TABLE_NAME, COLUMN_ID, mapOf(
                COLUMN_ID_COMPANY to CreatorTable.Type.INTEGER,
                COLUMN_ID_CAREER to CreatorTable.Type.INTEGER
        )).makeCreateJoinQuery()
    }
}