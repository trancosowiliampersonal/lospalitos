package br.com.faesa.app.main.epoxy

import android.view.View
import android.widget.ImageView
import br.com.faesa.app.R
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder

/**
 * @author wiliam
 * @date 6/3/18
 */
@EpoxyModelClass(layout = R.layout.banner)
abstract class BannerModel : EpoxyModelWithHolder<BannerModel.Holder>() {

    @EpoxyAttribute
    var img: Int? = null

    override fun bind(holder: Holder) {
        img?.let {
            holder.imgBanner?.setImageResource(it)
        }
    }

    class Holder : EpoxyHolder() {

        var imgBanner: ImageView? = null

        override fun bindView(itemView: View?) {
            imgBanner = itemView?.findViewById(R.id.banImgBanner)
        }
    }
}