package br.com.faesa.app.career.epoxy

import br.com.faesa.app.data.model.KnowledgeSimpleModel
import com.airbnb.epoxy.TypedEpoxyController

/**
 * @author wiliam
 * @date 6/5/18
 */
class KnowledgeController : TypedEpoxyController<List<KnowledgeSimpleModel>>() {

    var listener:((KnowledgeSimpleModel) -> Unit)? = null

    override fun buildModels(data: List<KnowledgeSimpleModel>?) {

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