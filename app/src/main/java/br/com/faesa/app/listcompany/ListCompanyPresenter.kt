package br.com.faesa.app.listcompany

import br.com.faesa.app.data.repository.remote.CompanyRepository

/**
 * Created by wiliam on 5/22/18.
 */
class ListCompanyPresenter(val companyRepository: CompanyRepository) : ListCompanyContract.Presenter {

    override lateinit var view: ListCompanyContract.View

    override fun loadList() {
        view.showLoadDialog()
        companyRepository.getAll { apiResponse ->
            if(apiResponse.isSuccess) {
                view.loadList(apiResponse.data ?: listOf())
            }

            view.dismissLoadDialog()
        }
    }
}
