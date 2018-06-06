package br.com.faesa.app.main.epoxy

import br.com.faesa.app.R
import br.com.faesa.app.data.model.KnowledgeSimple
import com.airbnb.epoxy.TypedEpoxyController

/**
 * @author wiliam
 * @date 6/6/18
 */
class KnowledgeController: TypedEpoxyController<List<KnowledgeSimple>>() {

    var listener:((KnowledgeSimple) -> Unit)? = null

    override fun buildModels(data: List<KnowledgeSimple>?) {
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