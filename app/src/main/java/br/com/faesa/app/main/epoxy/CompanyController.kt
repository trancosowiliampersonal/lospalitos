package br.com.faesa.app.main.epoxy

import br.com.faesa.app.R
import br.com.faesa.app.data.model.CompanySimple
import com.airbnb.epoxy.TypedEpoxyController

/**
 * @author wiliam
 * @date 6/3/18
 */
class CompanyController : TypedEpoxyController<List<CompanySimple>>() {

    var listener:((CompanySimple) -> Unit)? = null

    override fun buildModels(data: List<CompanySimple>?) {

        BannerModel_()
                .id(0)
                .img(R.drawable.banner_company)
                .addTo(this)

        data?.forEach {
            CompanyModel_()
                    .id(it.id)
                    .name(it.name)
                    .description(it.description)
                    .listener(object : CompanyModel.OnClickListener {
                        override fun onClick() {
                            listener?.invoke(it)
                        }
                    })
                    .addTo(this)
        }
    }

}