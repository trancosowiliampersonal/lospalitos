package br.com.faesa.app.career

import br.com.faesa.app.data.repository.remote.CareerRepository

/**
 * Created by wiliam on 5/23/18.
 */
class CareerPresenter(val repository: CareerRepository) : CareerContract.Presenter {
    override lateinit var view: CareerContract.View

    override fun loadCareer(idCareer: Long) {
        view.showLoadDialog()

        repository.get(idCareer) { resp ->
            if (resp.isSuccess && resp.data != null) {
                view.loadCareer(resp.data)
            }

            view.dismissLoadDialog()
        }
    }
}