package br.com.faesa.app.ext

import android.view.View

/**
 * @author wiliam
 * @date 6/6/18
 */

var View.isVisible: Boolean
    get() = this.visibility == View.VISIBLE
    set(value) {
        this.visibility = if (value) View.VISIBLE else View.GONE
    }

fun View.show() {
    this.isVisible = true
}

fun View.dismiss() {
    this.isVisible = false
}