package br.com.faesa.app.data.repository.remote.service

import br.com.faesa.app.data.model.CareerSimpleModel
import br.com.faesa.app.data.model.KnowledgeSimpleModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * @author wiliam
 * @date 5/30/18
 */
interface KnowledgeService {
    @GET("knowledge")
    fun getAll(): Call<List<KnowledgeSimpleModel>>
}