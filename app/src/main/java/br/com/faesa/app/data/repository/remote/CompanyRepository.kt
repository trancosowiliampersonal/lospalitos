package br.com.faesa.app.data.repository.remote

import br.com.faesa.app.data.model.CareerSimple
import br.com.faesa.app.data.model.CompanySimple
import br.com.faesa.app.data.model.CompanyWithCareers
import br.com.faesa.app.domain.ApiResponse

/**
 * @author wiliam
 * @date 5/30/18
 * @see CompanyService
 */
interface CompanyRepository {
    fun getAll(callback: (ApiResponse<List<CompanySimple>>) -> Unit)
    fun get(idCompany: Long, callback: (ApiResponse<CompanyWithCareers>) -> Unit)
    fun getCompanyCareers(idCompany: Long, callback: (ApiResponse<List<CareerSimple>>) -> Unit)
}