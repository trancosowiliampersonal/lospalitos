package br.com.faesa.app.domain

/**
 * @author wiliam
 * @date 5/30/18
 */
data class ApiResponse<out T>(
        val isSuccess:Boolean,
        val data:T?,
        val error:ApiError?)