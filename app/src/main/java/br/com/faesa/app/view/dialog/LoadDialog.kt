package br.com.faesa.app.view.dialog

import android.app.ProgressDialog
import android.content.Context
import br.com.faesa.app.R

class LoadDialog(context: Context) {

    val progressDialog = ProgressDialog(context, R.style.AppCompatAlertDialogStyle)

    init {
        progressDialog.setTitle("")
        progressDialog.setMessage("Carregando")
        progressDialog.isIndeterminate = true
        progressDialog.setCancelable(false)
    }

    fun show() {
        progressDialog.show()
    }

    fun dismiss() {
        if(progressDialog.isShowing) progressDialog.dismiss()
    }


}