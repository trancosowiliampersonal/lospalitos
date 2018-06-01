package br.com.faesa.app.company

import br.com.faesa.app.data.repository.remote.CompanyRepository

/**
 * Created by wiliam on 5/23/18.
 */
class CompanyPresenter(val repository: CompanyRepository) : CompanyContract.Presenter {

    override lateinit var view: CompanyContract.View

    override fun loadCompany(idCompany: Long) {
        view.showLoadDialog()

        repository.get(idCompany) { resp ->
            if (resp.isSuccess && resp.data != null) {
                view.loadCompany(resp.data)
            }

            view.dismissLoadDialog()
        }
    }
}