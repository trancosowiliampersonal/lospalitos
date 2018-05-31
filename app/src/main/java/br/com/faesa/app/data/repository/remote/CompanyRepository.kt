package br.com.faesa.app.data.repository.remote

import br.com.faesa.app.data.model.CareerSimpleModel
import br.com.faesa.app.data.model.CompanySimpleModel
import br.com.faesa.app.domain.ApiResponse

/**
 * @author wiliam
 * @date 5/30/18
 */
interface CompanyRepository {
    fun getAll(callback:(ApiResponse<List<CompanySimpleModel>>) -> Unit)
    fun getCompanyCareers(idCompany:Long, callback: (ApiResponse<List<CareerSimpleModel>>) -> Unit)
}