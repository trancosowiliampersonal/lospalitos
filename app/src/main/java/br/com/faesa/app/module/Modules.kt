package br.com.faesa.app.module

import br.com.faesa.app.career.CareerContract
import br.com.faesa.app.career.CareerPresenter
import br.com.faesa.app.company.CompanyContract
import br.com.faesa.app.company.CompanyPresenter
import br.com.faesa.app.knowledge.KnowledgeContract
import br.com.faesa.app.knowledge.KnowledgePresenter
import br.com.faesa.app.listcareer.ListCareerContract
import br.com.faesa.app.listcareer.ListCareerPresenter
import br.com.faesa.app.listcompany.ListCompanyContract
import br.com.faesa.app.listcompany.ListCompanyPresenter
import br.com.faesa.app.listknowledge.ListKnowledgeContract
import br.com.faesa.app.listknowledge.ListKnowledgePresenter
import org.koin.dsl.module.applicationContext

/**
 * Created by wiliam on 5/23/18.
 */
val mockModule = applicationContext {
    bean { CareerPresenter() as CareerContract.Presenter }
    bean { ListCareerPresenter(repository = get()) as ListCareerContract.Presenter }

    bean { CompanyPresenter(repository = get()) as CompanyContract.Presenter }
    bean { ListCompanyPresenter(companyRepository = get()) as ListCompanyContract.Presenter }

    bean { KnowledgePresenter() as KnowledgeContract.Presenter }
    bean { ListKnowledgePresenter(repository = get()) as ListKnowledgeContract.Presenter }
}