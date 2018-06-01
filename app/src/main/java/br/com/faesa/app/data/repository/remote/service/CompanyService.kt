package br.com.faesa.app.data.repository.remote.service

import br.com.faesa.app.data.model.CareerSimpleModel
import br.com.faesa.app.data.model.CompanySimpleModel
import br.com.faesa.app.data.model.CompanyWithCareersModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * @author wiliam
 * @date 5/30/18
 */
interface CompanyService {
    @GET("company")
    fun getAll(): Call<List<CompanySimpleModel>>

    @GET("company/{idCompany}")
    fun get(@Path("idCompany") idCompany: Long): Call<CompanyWithCareersModel>

    @GET("company/{idCompany}/career")
    fun getCompanyCareers(@Path("idCompany") idCompany: Long): Call<List<CareerSimpleModel>>
}