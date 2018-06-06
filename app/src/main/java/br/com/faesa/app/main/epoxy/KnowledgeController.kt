package br.com.faesa.app.main.epoxy

import br.com.faesa.app.R
import br.com.faesa.app.data.model.KnowledgeSimpleModel
import com.airbnb.epoxy.TypedEpoxyController

/**
 * @author wiliam
 * @date 6/6/18
 */
class KnowledgeController: TypedEpoxyController<List<KnowledgeSimpleModel>>() {

    var listener:((KnowledgeSimpleModel) -> Unit)? = null

    override fun buildModels(data: List<KnowledgeSimpleModel>?) {
        BannerModel_()
                .id(0)
                .img(R.drawable.banner_progress)
                .addTo(this)

        data?.forEach {
            KnowledgeModel_()
                    .id(it.id)
                    .name(it.name)
                    .listener(object : KnowledgeModel.OnClickListener {
                        override fun onClick() {
                            listener?.invoke(it)
                        }
                    })
                    .addTo(this)
        }
    }
}