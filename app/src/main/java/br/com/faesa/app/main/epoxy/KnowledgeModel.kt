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
 * @date 6/6/18
 */
@EpoxyModelClass(layout = R.layout.item_kwnoledge)
abstract class KnowledgeModel : EpoxyModelWithHolder<KnowledgeModel.Holder>() {

    @EpoxyAttribute
    var name: String? = null

    @EpoxyAttribute(hash = false)
    var listener:OnClickListener? = null

    override fun bind(holder: Holder) {
        holder.txtName?.text = name
        holder.itemView?.setOnClickListener {
            listener?.onClick()
        }
    }

    class Holder : EpoxyHolder() {

        var itemView: View? = null
        var txtName: AppCompatTextView? = null

        override fun bindView(itemView: View?) {
            this.itemView = itemView
            txtName = itemView?.findViewById(R.id.itTxtKnowledgeName)
        }
    }

    interface OnClickListener {
        fun onClick()
    }
}