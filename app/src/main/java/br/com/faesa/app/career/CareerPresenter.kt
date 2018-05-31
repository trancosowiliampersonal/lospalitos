package br.com.faesa.app.career

/**
 * Created by wiliam on 5/23/18.
 */
class CareerPresenter : CareerContract.Presenter {
    override lateinit var view: CareerContract.View

    override fun loadCareer(idCareer: Long) {
        view.showLoadDialog()
        view.loadCareer(null)
        view.dismissLoadDialog()
    }
}