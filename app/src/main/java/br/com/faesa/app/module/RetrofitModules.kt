package br.com.faesa.app.module

import br.com.faesa.app.BuildConfig
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.Interceptor

import java.util.concurrent.TimeUnit

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module.applicationContext
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
* @author wiliam
* @date 5/30/18
*/

const val BASE_URL = "http://192.168.0.67:4567/api/"

val retrofitClientModule = applicationContext {

    bean{
        Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory( /*Converter.Factory*/ get())
                .client(/* OkHttpClient */ get())
                .build()
    }

    factory { GsonBuilder() .create() as Gson }

    factory {

        OkHttpClient.Builder()
                .readTimeout(180, TimeUnit.SECONDS)
                .connectTimeout(180, TimeUnit.SECONDS)
                .addInterceptor( get("loggerInterceptor") )
                .addInterceptor( get("headerInterceptor") )
                .build() as OkHttpClient
    }

    bean { GsonConverterFactory.create(/* Gson */ get()) as Converter.Factory }

    factory("headerInterceptor") {
        Interceptor { chain ->
            val requestBuilder = chain?.request()?.newBuilder()
            requestBuilder?.header("Content-Type", "application/json")
            chain!!.proceed(requestBuilder?.build())
        }
    }

    factory("loggerInterceptor") {
        val logging = HttpLoggingInterceptor()
        logging.level = if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY else HttpLoggingInterceptor.Level.NONE
        logging
    }
}