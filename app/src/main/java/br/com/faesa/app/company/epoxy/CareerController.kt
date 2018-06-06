package br.com.faesa.app.company.epoxy

import br.com.faesa.app.data.model.CareerSimpleModel
import com.airbnb.epoxy.TypedEpoxyController

/**
 * @author wiliam
 * @date 5/31/18
 */
class CareerController : TypedEpoxyController<List<CareerSimpleModel>>() {

    var listener:((CareerSimpleModel) -> Unit)? = null

    override fun buildModels(data: List<CareerSimpleModel>?) {

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