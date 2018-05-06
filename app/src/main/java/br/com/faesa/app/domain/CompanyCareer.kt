package br.com.faesa.app.domain

/**
 * Created by wiliam on 5/6/18.
 */
data class CompanyCareer (
        val idCompany: Long,
        val idCareer: Long
): EntityJoin {
    override var idT: Long = idCompany
    override var idR: Long = idCareer
}