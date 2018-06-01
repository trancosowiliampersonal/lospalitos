package br.com.faesa.app.listcompany

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.faesa.app.R
import br.com.faesa.app.data.model.CompanySimpleModel
import kotlinx.android.synthetic.main.banner.view.*
import kotlinx.android.synthetic.main.item_company.view.*

/**
 * Created by wiliam on 5/5/18.
 */
class ListCompanyAdapter : RecyclerView.Adapter<ListCompanyAdapter.CompanyHolder>() {

    var onClickListener: ((CompanySimpleModel) -> Unit)? = null
    var itens: List<CompanySimpleModel> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    companion object {
        const val TYPE_BANNER = 0
        const val TYPE_DETAIL = 1
    }

    override fun onBindViewHolder(holder: CompanyHolder, position: Int) {
        holder?.render(itens.elementAtOrNull(position - 1))

        (holder as? CompanyDetailHolder)?.itemView?.setOnClickListener {
            onClickListener?.invoke(itens[position - 1])
        }
    }

    override fun getItemCount(): Int {
        return itens.size + 1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CompanyHolder {

        val holder = when (viewType) {
            TYPE_BANNER -> CompanyBannerHolder(LayoutInflater.from(parent?.context).inflate(R.layout.banner, parent, false))
            else -> CompanyDetailHolder(LayoutInflater.from(parent?.context).inflate(R.layout.item_company, parent, false))
        }

        return holder
    }

    override fun getItemViewType(position: Int): Int {
        return when (position) {
            0 -> TYPE_BANNER
            else -> TYPE_DETAIL
        }
    }

    abstract class CompanyHolder(view: View) : RecyclerView.ViewHolder(view) {
        abstract fun render(item: CompanySimpleModel?)
    }

    class CompanyDetailHolder(view: View) : CompanyHolder(view) {
        override fun render(iten: CompanySimpleModel?) {
            itemView.itTxtCompanyName.text = iten?.name
            itemView.itTxtCompanyDescription.text = iten?.description
        }
    }

    class CompanyBannerHolder(view: View) : CompanyHolder(view) {
        override fun render(iten: CompanySimpleModel?) {
            itemView.banImgBanner.setImageResource(R.drawable.banner_company)
        }
    }
}