package br.com.faesa.app.module

import br.com.faesa.app.data.repository.remote.CompanyRepository
import br.com.faesa.app.data.repository.remote.CompanyRepositoryImpl
import org.koin.dsl.module.applicationContext

/**
 * @author wiliam
 * @date 5/30/18
 */

val servicesModule = applicationContext {
    bean { CompanyRepositoryImpl(retrofit = get()) as CompanyRepository}
}