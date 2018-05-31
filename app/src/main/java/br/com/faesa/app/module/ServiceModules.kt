package br.com.faesa.app.module

import br.com.faesa.app.data.repository.remote.*
import org.koin.dsl.module.applicationContext

/**
 * @author wiliam
 * @date 5/30/18
 */

val servicesModule = applicationContext {
    bean { CompanyRepositoryImpl(retrofit = get()) as CompanyRepository }
    bean { CareerRepositoryImpl(retrofit = get()) as CareerRepository }
    bean { KnowledgeRepositoryImpl(retrofit = get()) as KnowledgeRepository }
}