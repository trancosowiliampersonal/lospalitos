package br.com.faesa.app.listcareer

import br.com.faesa.app.domain.Career
import br.com.faesa.app.repository.REPOSITORY

/**
 * Created by wiliam on 5/22/18.
 */
class ListCareerPresenter : ListCareerContract.Presenter {

    override lateinit var view: ListCareerContract.View

    override fun loadList(idCompany: Long) {
        view.showLoadDialog()
        view.loadList(getList(idCompany))
        view.dismissLoadDialog()
    }

    fun getList(idCompany: Long): List<Career> {
        return REPOSITORY.COMPANY.ALL.firstOrNull { it.id == idCompany }.let { company ->
            company?.careers
        } ?: REPOSITORY.CAREER.ALL
    }

}
