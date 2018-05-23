package br.com.faesa.app.listcompany

import br.com.faesa.app.BasePresenter
import br.com.faesa.app.BaseView
import br.com.faesa.app.domain.Career
import br.com.faesa.app.domain.Company

/**
 * Created by wiliam on 5/22/18.
 */
interface ListCareerContract {
    interface Presenter : BasePresenter<View> {
        fun loadList(idCompany: Long)
    }

    interface View : BaseView<Presenter> {
        fun showLoadDialog()
        fun dismissLoadDialog()
        fun loadList(list: List<Career>)
    }
}