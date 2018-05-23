package br.com.faesa.app.company

import br.com.faesa.app.repository.REPOSITORY

/**
 * Created by wiliam on 5/23/18.
 */
class CareerPresenter : CareerContract.Presenter {
    override fun loadCareer(idCareer: Long) {
        view.showLoadDialog()
        view.loadCareer(REPOSITORY.CAREER.ALL.firstOrNull { it.id == idCareer })
        view.dismissLoadDialog()
    }

    override lateinit var view: CareerContract.View
}