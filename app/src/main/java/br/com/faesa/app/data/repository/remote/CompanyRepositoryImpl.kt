package br.com.faesa.app.data.repository.remote

import br.com.faesa.app.data.model.CareerSimpleModel
import br.com.faesa.app.data.model.CompanySimpleModel
import br.com.faesa.app.data.model.CompanyWithCareersModel
import br.com.faesa.app.data.repository.remote.service.CompanyService
import br.com.faesa.app.domain.ApiResponse
import retrofit2.Retrofit

/**
 * @author wiliam
 * @date 5/30/18
 */
class CompanyRepositoryImpl(val retrofit: Retrofit) : CompanyRepository {

    private val companyService = retrofit.create(CompanyService::class.java)

    override fun getAll(callback: (ApiResponse<List<CompanySimpleModel>>) -> Unit) {
        companyService.getAll().exec(callback)
    }

    override fun get(idCompany: Long, callback: (ApiResponse<CompanyWithCareersModel>) -> Unit) {
        companyService.get(idCompany).exec(callback)
    }

    override fun getCompanyCareers(idCompany: Long, callback: (ApiResponse<List<CareerSimpleModel>>) -> Unit) {
        companyService.getCompanyCareers(idCompany).exec(callback)
    }
}
