package br.com.faesa.app.main.epoxy

import br.com.faesa.app.R
import br.com.faesa.app.data.model.CareerSimple
import com.airbnb.epoxy.TypedEpoxyController

/**
 * @author wiliam
 * @date 6/5/18
 */
class CareerController : TypedEpoxyController<List<CareerSimple>>() {

    var listener:((CareerSimple) -> Unit)? = null

    override fun buildModels(data: List<CareerSimple>?) {
        BannerModel_()
                .id(0)
                .img(R.drawable.banner_career)
                .addTo(this)

        data?.forEach {
            CareerModel_()
                    .id(it.id)
                    .name(it.name)
                    .description(it.description)
                    .listener(object : CareerModel.OnClickListener {
                        override fun onClick() {
                            listener?.invoke(it)
                        }
                    })
                    .addTo(this)
        }
    }

}