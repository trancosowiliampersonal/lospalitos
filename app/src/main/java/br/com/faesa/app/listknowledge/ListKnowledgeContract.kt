package br.com.faesa.app.listknowledge

import br.com.faesa.app.BasePresenter
import br.com.faesa.app.BaseView
import br.com.faesa.app.domain.Knowledge

/**
 * Created by wiliam on 5/23/18.
 */
interface ListKnowledgeContract {

    interface Presenter : BasePresenter<View> {
        fun loadList(idCareer: Long)
    }

    interface View : BaseView<Presenter> {
        fun showLoadDialog()
        fun dismissLoadDialog()
        fun loadList(list: List<Knowledge>)
    }
}