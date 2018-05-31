package br.com.faesa.app.data.repository.remote

import br.com.faesa.app.data.model.CareerSimpleModel
import br.com.faesa.app.data.model.KnowledgeSimpleModel
import br.com.faesa.app.data.repository.remote.service.CareerService
import br.com.faesa.app.domain.ApiResponse
import retrofit2.Retrofit

/**
 * @author wiliam
 * @date 5/31/18
 */
class CareerRepositoryImpl(val retrofit: Retrofit) : CareerRepository {

    val service by lazy { retrofit.create(CareerService::class.java) }

    override fun getAll(callback: (ApiResponse<List<CareerSimpleModel>>) -> Unit) {
        service.getAll().exec(callback)
    }

    override fun getCareerKnowledges(idCareer: Long, callback: (ApiResponse<List<KnowledgeSimpleModel>>) -> Unit) {
        service.getCareerKnowledges(idCareer).exec(callback)
    }

}