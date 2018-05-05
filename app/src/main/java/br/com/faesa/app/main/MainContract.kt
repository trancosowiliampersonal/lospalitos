package br.com.faesa.app.main

import br.com.faesa.app.BasePresenter
import br.com.faesa.app.BaseView

/**
 * Created by wiliam on 5/5/18.
 */
interface MainContract {
    interface View : BaseView<Presenter> {

    }

    interface Presenter : BasePresenter<View> {

    }
}
