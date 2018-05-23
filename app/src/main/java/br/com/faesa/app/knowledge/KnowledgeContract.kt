package br.com.faesa.app.knowledge

import br.com.faesa.app.BasePresenter
import br.com.faesa.app.BaseView
import br.com.faesa.app.domain.Knowledge

/**
 * Created by wiliam on 5/23/18.
 */
interface KnowledgeContract{
    interface Presenter : BasePresenter<View> {
        fun loadKnowledge(idKnowledge: Long)
    }

    interface View : BaseView<Presenter> {
        fun showLoadDialog()
        fun dismissLoadDialog()
        fun loadKnowledge(knowledge: Knowledge?)
    }
}