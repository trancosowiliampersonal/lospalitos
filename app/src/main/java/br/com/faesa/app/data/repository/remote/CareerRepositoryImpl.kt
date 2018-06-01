package br.com.faesa.app.data.repository.remote

import br.com.faesa.app.data.model.CareerSimpleModel
import br.com.faesa.app.data.model.KnowledgeSimpleModel
import br.com.faesa.app.data.repository.remote.service.CareerService
import br.com.faesa.app.data.repository.remote.service.CompanyService
import br.com.faesa.app.domain.ApiResponse
import retrofit2.Retrofit

/**
 * @author wiliam
 * @date 5/31/18
 */
class CareerRepositoryImpl(val retrofit: Retrofit) : CareerRepository {

    private val careerService by lazy { retrofit.create(CareerService::class.java) }
    private val companyService by lazy { retrofit.create(CompanyService::class.java) }

    override fun getAll(callback: (ApiResponse<List<CareerSimpleModel>>) -> Unit) {
        careerService.getAll().exec(callback)
    }

    override fun getCompanyCareers(idCompany: Long, callback: (ApiResponse<List<CareerSimpleModel>>) -> Unit) {
        companyService.getCompanyCareers(idCompany).exec(callback)
    }

    override fun getCareerKnowledges(idCareer: Long, callback: (ApiResponse<List<KnowledgeSimpleModel>>) -> Unit) {
        careerService.getCareerKnowledges(idCareer).exec(callback)
    }
}
