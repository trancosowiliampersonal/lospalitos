package br.com.faesa.app.company

import br.com.faesa.app.BasePresenter
import br.com.faesa.app.BaseView

/**
 * Created by wiliam on 5/23/18.
 */
interface CompanyContract {
    interface Presenter : BasePresenter<View> {
        fun loadCompany(idCompany: Long)
    }

    interface View : BaseView<Presenter> {
        fun showLoadDialog()
        fun dismissLoadDialog()
        fun loadCompany(company: CompanyWithCarrersSimpleModel?)
    }
}