package br.com.faesa.app.view.dialog

import android.app.ProgressDialog
import android.content.Context
import br.com.faesa.app.R

class LoadDialog(val context: Context,
                 val message: String = "Carregando",
                 val title: String = "",
                 val isIndeterminate: Boolean = true,
                 val cancelable: Boolean = false) {

    val progressDialog:ProgressDialog

    init {
        progressDialog = ProgressDialog(context, R.style.AppCompatAlertDialogStyle).apply {
            setMessage(message)
            setTitle(title)
            isIndeterminate = isIndeterminate
            setCancelable(cancelable)
        }
    }

    fun show() {
        progressDialog.show()
    }

    fun dismiss() {
        if (progressDialog.isShowing) progressDialog.dismiss()
    }
}