package br.com.faesa.app.listknowledge

import br.com.faesa.app.domain.Knowledge
import br.com.faesa.app.data.REPOSITORY

/**
 * Created by wiliam on 5/22/18.
 */
class ListKnowledgePresenter: ListKnowledgeContract.Presenter {

    override lateinit var view: ListKnowledgeContract.View

    override fun loadList(idCompany: Long) {
        view.showLoadDialog()
        view.loadList(getList(idCompany))
        view.dismissLoadDialog()
    }

    fun getList(idCareer: Long): List<Knowledge> {
        return REPOSITORY.CAREER.ALL.firstOrNull { it.id == idCareer }.let { career ->
            career?.knowledges
        } ?: REPOSITORY.KNOWLEDGE.ALL
    }

}
