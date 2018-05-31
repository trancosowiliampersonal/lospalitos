package br.com.faesa.app.data.repository.remote

import br.com.faesa.app.domain.ApiCallback
import br.com.faesa.app.domain.ApiResponse
import retrofit2.Call

/**
 * @author wiliam
 * @date 5/31/18
 */

internal fun <T> Call<T>.exec(callback: (ApiResponse<T>) -> Unit){
    this.enqueue(object : ApiCallback<T> {
        override fun onResponse(apiResponse: ApiResponse<T>) {
            callback(apiResponse)
        }
    })
}