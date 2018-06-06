package br.com.faesa.app.main.listknowledge

import br.com.faesa.app.data.model.KnowledgeSimpleModel
import br.com.faesa.app.data.repository.remote.KnowledgeRepository
import br.com.faesa.app.domain.ApiResponse

/**
 * Created by wiliam on 5/22/18.
 */
class ListKnowledgePresenter(val repository: KnowledgeRepository): ListKnowledgeContract.Presenter {

    override lateinit var view: ListKnowledgeContract.View

    override fun loadList() {
        view.showLoadDialog()

        repository.getAll { apiResponse ->
            if(apiResponse.isSuccess) {
                view.loadList(apiResponse.data ?: listOf())
            }

            view.dismissLoadDialog()
        }
    }
}
