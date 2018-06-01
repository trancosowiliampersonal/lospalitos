package br.com.faesa.app.listknowledge

import br.com.faesa.app.data.model.KnowledgeSimpleModel
import br.com.faesa.app.data.repository.remote.KnowledgeRepository
import br.com.faesa.app.domain.ApiResponse

/**
 * Created by wiliam on 5/22/18.
 */
class ListKnowledgePresenter(val repository: KnowledgeRepository): ListKnowledgeContract.Presenter {

    override lateinit var view: ListKnowledgeContract.View

    override fun loadList(idCareer: Long?) {
        view.showLoadDialog()

        if (idCareer != null) {
            repository.getCareerKnowledges(idCareer, loadListCallback)
        } else {
            repository.getAll(loadListCallback)
        }
    }

    val loadListCallback: (ApiResponse<List<KnowledgeSimpleModel>>) -> Unit = { resp ->
        if (resp.isSuccess) {
            view.loadList(resp.data ?: listOf())
        }

        view.dismissLoadDialog()
    }

}
