package br.com.faesa.app.knowledge

import br.com.faesa.app.data.REPOSITORY

/**
 * Created by wiliam on 5/23/18.
 */
class KnowledgePresenter : KnowledgeContract.Presenter {
    override lateinit var view: KnowledgeContract.View

    override fun loadKnowledge(idKnowledge: Long) {
        view.showLoadDialog()
        view.loadKnowledge(REPOSITORY.KNOWLEDGE.ALL.firstOrNull { it.id == idKnowledge })
        view.dismissLoadDialog()
    }
}