package br.com.faesa.app.main.epoxy

import android.support.v7.widget.AppCompatTextView
import android.view.View
import br.com.faesa.app.R
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder


/**
 * @author wiliam
 * @date 6/5/18
 */
@EpoxyModelClass(layout = R.layout.item_career)
abstract class CareerModel : EpoxyModelWithHolder<CareerModel.Holder>() {

    @EpoxyAttribute
    var name: String? = null

    @EpoxyAttribute
    var description: String? = null

    @EpoxyAttribute(hash = false)
    var listener:OnClickListener? = null

    override fun bind(holder: Holder) {
        holder.itemView?.setOnClickListener {
            listener?.onClick()
        }
        holder.txtName?.text = name
        holder.txtDescription?.text = description
    }

    class Holder : EpoxyHolder() {

        var itemView: View? = null
        var txtName: AppCompatTextView? = null
        var txtDescription: AppCompatTextView? = null

        override fun bindView(itemView: View?) {
            this.itemView = itemView
            txtName = itemView?.findViewById(R.id.itTxtCareerName)
            txtDescription = itemView?.findViewById(R.id.itTxtCareerDescription)
        }
    }

    interface OnClickListener {
        fun onClick()
    }
}