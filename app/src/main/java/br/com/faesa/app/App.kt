package br.com.faesa.app

import android.app.Application
import br.com.faesa.app.module.mockModule
import br.com.faesa.app.module.retrofitClientModule
import br.com.faesa.app.module.servicesModule
import org.koin.android.ext.android.startKoin

/**
 * Created by wiliam on 5/23/18.
 */
class App : Application() {

    val modules = listOf(
            mockModule,

            retrofitClientModule,
            servicesModule

    )

    override fun onCreate() {
        super.onCreate()
        startKoin(this, modules)
    }
}