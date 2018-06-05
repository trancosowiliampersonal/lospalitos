package br.com.faesa.app.main.listcareer

import br.com.faesa.app.data.model.CareerSimpleModel
import br.com.faesa.app.data.repository.remote.CareerRepository
import br.com.faesa.app.domain.ApiResponse

/**
 * Created by wiliam on 5/22/18.
 */
class ListCareerPresenter(val repository: CareerRepository) : ListCareerContract.Presenter {

    override lateinit var view: ListCareerContract.View

    override fun loadList(idCompany: Long?) {
        view.showLoadDialog()

        if (idCompany != null) {
            repository.getCompanyCareers(idCompany, loadListCallback)
        } else {
            repository.getAll(loadListCallback)
        }
    }

    val loadListCallback: (ApiResponse<List<CareerSimpleModel>>) -> Unit = { resp ->
        if (resp.isSuccess) {
            view.loadList(resp.data ?: listOf())
        }

        view.dismissLoadDialog()
    }
}
