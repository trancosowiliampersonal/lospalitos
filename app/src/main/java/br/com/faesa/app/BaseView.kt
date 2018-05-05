package br.com.faesa.app

/**
 * Created by wiliam on 5/5/18.
 */
interface BaseView<out T : BasePresenter<*>> {
    val presenter: T
}