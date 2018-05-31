package br.com.faesa.app.domain

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * @author wiliam
 * @date 5/31/18
 */
interface ApiCallback<T> : Callback<T> {
    override fun onResponse(call: Call<T>?, response: Response<T>?) {
        if (response?.isSuccessful == true) {
            onResponse(ApiResponse(true, response?.body(), null))
        } else {
            onResponse(ApiResponse(false, null, ApiError(400, "Erro não tratado")))
        }
    }

    override fun onFailure(call: Call<T>?, t: Throwable?) {
        onResponse(ApiResponse(false, null, ApiError(400, "Erro não tratado")))
    }

    fun onResponse(apiResponse: ApiResponse<T>)
}