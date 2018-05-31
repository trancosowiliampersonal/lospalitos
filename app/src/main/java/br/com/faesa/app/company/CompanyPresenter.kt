package br.com.faesa.app.company

import br.com.faesa.app.data.repository.remote.CompanyRepository

/**
 * Created by wiliam on 5/23/18.
 */
class CompanyPresenter(val companyRepository: CompanyRepository) : CompanyContract.Presenter {

    override fun loadCompany(idCompany: Long) {
        view.showLoadDialog()
        companyRepository.get(idCompany) { apiResponse ->
            if (apiResponse.isSuccess) {
                view.loadCompany(apiResponse.data)
            }

            view.dismissLoadDialog()
        }
    }

    override lateinit var view: CompanyContract.View
}