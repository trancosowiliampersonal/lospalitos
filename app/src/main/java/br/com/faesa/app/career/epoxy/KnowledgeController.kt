package br.com.faesa.app.career.epoxy

import br.com.faesa.app.data.model.KnowledgeSimpleModel
import com.airbnb.epoxy.TypedEpoxyController

/**
 * @author wiliam
 * @date 6/5/18
 */
class KnowledgeController : TypedEpoxyController<List<KnowledgeSimpleModel>>() {

    override fun buildModels(data: List<KnowledgeSimpleModel>?) {

        data?.forEach {
            KnowledgeModel_()
                    .id(it.id)
                    .name(it.name)
                    .addTo(this)
        }
    }

}