package br.com.faesa.app.company

import br.com.faesa.app.repository.REPOSITORY

/**
 * Created by wiliam on 5/23/18.
 */
class CompanyPresenter : CompanyContract.Presenter {
    override fun loadCompany(idCompany: Long) {
        view.showLoadDialog()
        view.loadCompany(REPOSITORY.COMPANY.ALL.firstOrNull { it.id == idCompany })
        view.dismissLoadDialog()
    }

    override lateinit var view: CompanyContract.View
}