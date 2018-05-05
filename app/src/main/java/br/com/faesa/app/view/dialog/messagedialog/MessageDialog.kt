package br.com.faesa.app.view.dialog.messagedialog

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatDialogFragment
import android.util.TypedValue
import android.widget.Button
import android.widget.LinearLayout
import android.widget.LinearLayout.LayoutParams
import br.com.faesa.app.R
import br.com.faesa.app.view.component.AppButton
import kotlinx.android.synthetic.main.fragment_dialog_message.view.*

class MessageDialog : AppCompatDialogFragment() {

    companion object {

        const val TAG = "MessageDialog"
        const val ARG_DATA = "ARG_DATA"

        fun newInstance(alert: Alert): MessageDialog {
            val args = Bundle()
            args.putParcelable(ARG_DATA, alert)
            val dialog = MessageDialog()
            dialog.arguments = args
            dialog.isCancelable = false
            return dialog
        }
    }

    var onButtonClickListener:((code:Int) -> Unit)? = null

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val view = activity?.layoutInflater?.inflate(R.layout.fragment_dialog_message, null)
        val builder = AlertDialog.Builder(activity!!)

        builder.setView(view)
        val dialogBuilder = builder.create()
        dialogBuilder.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        view?.apply {
            val alert = arguments?.getParcelable<Alert>(ARG_DATA)

            view.txvTitle.text = alert?.title
            view.txvMessage.text = alert?.text

            alert?.buttons?.forEach { info ->
                val button = AppButton(view.context, info.type)

                button.text = info.title
                button.setMargins(bottom = 10.pxToDp())

                button.setOnClickListener {
                    onButtonClickListener?.invoke(info.code)
                    this@MessageDialog.dismiss()
                }

                view.llContainer.addView(button)
            }
        }

        return dialogBuilder
    }

    private fun Button.setMargins(left: Int = 0, top: Int = 0, right: Int = 0, bottom: Int = 0) {
        val layoutParams = LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
        layoutParams.setMargins(left, top, right, bottom)
        this.layoutParams = layoutParams
    }

    private fun Int.pxToDp() : Int{
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, this.toFloat(), context?.resources?.displayMetrics).toInt()
    }
}