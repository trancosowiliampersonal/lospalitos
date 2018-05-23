package br.com.faesa.app.listcompany

import br.com.faesa.app.repository.REPOSITORY

/**
 * Created by wiliam on 5/22/18.
 */
class ListCompanyPresenter : ListCompanyContract.Presenter {

    override lateinit var view: ListCompanyContract.View

    override fun loadList() {
        view.showLoadDialog()
        view.loadList(REPOSITORY.COMPANY.ALL)
        view.dismissLoadDialog()
    }
}
