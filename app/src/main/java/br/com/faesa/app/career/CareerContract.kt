package br.com.faesa.app.career

import br.com.faesa.app.BasePresenter
import br.com.faesa.app.BaseView
import br.com.faesa.app.data.model.CareerWithKnowledgesModel
import br.com.faesa.app.domain.Career

/**
 * Created by wiliam on 5/23/18.
 */
interface CareerContract{
    interface Presenter : BasePresenter<View> {
        fun loadCareer(idCareer: Long)
    }

    interface View : BaseView<Presenter> {
        fun showLoadDialog()
        fun dismissLoadDialog()
        fun loadCareer(career: CareerWithKnowledgesModel?)
    }
}