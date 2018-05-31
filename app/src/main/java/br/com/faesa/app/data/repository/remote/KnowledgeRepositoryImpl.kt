package br.com.faesa.app.data.repository.remote

import br.com.faesa.app.data.model.KnowledgeSimpleModel
import br.com.faesa.app.data.repository.remote.service.KnowledgeService
import br.com.faesa.app.domain.ApiResponse
import retrofit2.Retrofit

/**
 * @author wiliam
 * @date 5/31/18
 */
class KnowledgeRepositoryImpl(val retrofit: Retrofit) : KnowledgeRepository {

    val service by lazy { retrofit.create(KnowledgeService::class.java) }

    override fun getAll(callback: (ApiResponse<List<KnowledgeSimpleModel>>) -> Unit) {
        service.getAll().exec(callback)
    }

}