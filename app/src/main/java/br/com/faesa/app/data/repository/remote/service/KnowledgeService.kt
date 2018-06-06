package br.com.faesa.app.data.repository.remote.service

import br.com.faesa.app.data.model.KnowledgeSimple
import retrofit2.Call
import retrofit2.http.GET

/**
 * @author wiliam
 * @date 5/30/18
 */
interface KnowledgeService {
    @GET("knowledge")
    fun getAll(): Call<List<KnowledgeSimple>>
}