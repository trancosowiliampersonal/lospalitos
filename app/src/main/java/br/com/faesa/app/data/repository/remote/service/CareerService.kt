package br.com.faesa.app.data.repository.remote.service

import br.com.faesa.app.data.model.CareerSimpleModel
import br.com.faesa.app.data.model.CareerWithKnowledgesModel
import br.com.faesa.app.data.model.KnowledgeSimpleModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * @author wiliam
 * @date 5/30/18
 */
interface CareerService {
    @GET("career")
    fun getAll(): Call<List<CareerSimpleModel>>

    @GET("career/{idCareer}")
    fun get(@Path("idCareer") idCareer: Long): Call<CareerWithKnowledgesModel>

    @GET("career/{idCareer}/knowledge")
    fun getCareerKnowledges(@Path("idCareer") idCareer: Long): Call<List<KnowledgeSimpleModel>>
}