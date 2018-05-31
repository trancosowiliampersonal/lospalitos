package br.com.faesa.app.data.repository.remote.route

import br.com.faesa.app.domain.Company
import retrofit2.Call
import retrofit2.http.GET

/**
 * @author wiliam
 * @date 5/30/18
 */
interface CompanyRoute {
    @GET("company")
    fun get(idCompany:Long) : Call<Company>


    @GET("company")
    fun getAll() : Call<List<Company>>
}