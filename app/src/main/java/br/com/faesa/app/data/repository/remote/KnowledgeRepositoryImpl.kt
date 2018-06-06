package br.com.faesa.app.data.repository.remote

import br.com.faesa.app.data.model.KnowledgeSimple
import br.com.faesa.app.data.repository.remote.service.CareerService
import br.com.faesa.app.data.repository.remote.service.KnowledgeService
import br.com.faesa.app.domain.ApiResponse
import retrofit2.Retrofit

/**
 * @author wiliam
 * @date 5/31/18
 */
class KnowledgeRepositoryImpl(val retrofit: Retrofit) : KnowledgeRepository {

    private val knowledgeService by lazy { retrofit.create(KnowledgeService::class.java) }
    private val careerService by lazy { retrofit.create(CareerService::class.java) }

    override fun getAll(callback: (ApiResponse<List<KnowledgeSimple>>) -> Unit) {
        knowledgeService.getAll().exec(callback)
    }

    override fun getCareerKnowledges(idCareer: Long, callback: (ApiResponse<List<KnowledgeSimple>>) -> Unit) {
        careerService.getCareerKnowledges(idCareer).exec(callback)
    }
}