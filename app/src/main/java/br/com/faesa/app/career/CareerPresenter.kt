package br.com.faesa.app.career

import br.com.faesa.app.data.REPOSITORY

/**
 * Created by wiliam on 5/23/18.
 */
class CareerPresenter : CareerContract.Presenter {
    override lateinit var view: CareerContract.View

    override fun loadCareer(idCareer: Long) {
        view.showLoadDialog()
        view.loadCareer(REPOSITORY.CAREER.ALL.firstOrNull { it.id == idCareer })
        view.dismissLoadDialog()
    }
}