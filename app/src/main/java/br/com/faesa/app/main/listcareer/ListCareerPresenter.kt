package br.com.faesa.app.main.listcareer

import br.com.faesa.app.data.repository.remote.CareerRepository

/**
 * Created by wiliam on 5/22/18.
 */
class ListCareerPresenter(val repository: CareerRepository) : ListCareerContract.Presenter {

    override lateinit var view: ListCareerContract.View

    override fun loadList() {
        view.showLoadDialog()

        repository.getAll { resp ->
            if (resp.isSuccess) {
                view.loadList(resp.data ?: listOf())
            }

            view.dismissLoadDialog()
        }
    }
}
