package br.com.faesa.app.knowledge

/**
 * Created by wiliam on 5/23/18.
 */
class KnowledgePresenter : KnowledgeContract.Presenter {
    override lateinit var view: KnowledgeContract.View

    override fun loadKnowledge(idKnowledge: Long) {
        view.showLoadDialog()
        view.dismissLoadDialog()
    }
}