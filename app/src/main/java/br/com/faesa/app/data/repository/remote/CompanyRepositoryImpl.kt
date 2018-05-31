package br.com.faesa.app.data.repository.remote

import br.com.faesa.app.domain.Company
import br.com.faesa.app.data.repository.remote.route.CompanyRoute
import br.com.faesa.app.domain.ApiCallback
import br.com.faesa.app.domain.ApiResponse
import retrofit2.Retrofit

/**
 * @author wiliam
 * @date 5/30/18
 */
class CompanyRepositoryImpl(val retrofit : Retrofit) : CompanyRepository {

    private val service = retrofit.create(CompanyRoute::class.java)

    override fun getAll(callback: (ApiResponse<List<Company>>) -> Unit) {
        service.getAll().enqueue(object : ApiCallback<List<Company>>{
            override fun onResponse(apiResponse: ApiResponse<List<Company>>) {
                callback(apiResponse)
            }
        })
    }

    override fun get(idCompany: Long, callback: (ApiResponse<Company>) -> Unit) {

    }
}