package br.com.faesa.app.listknowledge

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.faesa.app.R
import br.com.faesa.app.domain.Knowledge
import kotlinx.android.synthetic.main.banner.view.*
import kotlinx.android.synthetic.main.item_kwnoledge.view.*

/**
 * Created by wiliam on 5/6/18.
 */
class KnowledgeAdapter (val itens: List<Knowledge>, val showBanner: Boolean = true) : RecyclerView.Adapter<KnowledgeAdapter.KnowledgeHolder>() {

    var onClickListener: ((Knowledge) -> Unit)? = null

    companion object {
        const val TYPE_BANNER = 0
        const val TYPE_DETAIL = 1
    }

    override fun onBindViewHolder(holder: KnowledgeHolder?, position: Int) {
        val pos = if(showBanner) position - 1 else position

        holder?.render(itens.elementAtOrNull(pos))

        (holder as? KnowledgeDetailHolder)?.itemView?.setOnClickListener {
            onClickListener?.invoke(itens[pos])
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): KnowledgeHolder {
        val holder = when(viewType) {
            TYPE_BANNER -> KnowledgeBannerHolder(LayoutInflater.from(parent?.context).inflate(R.layout.banner, parent, false))
            else -> KnowledgeDetailHolder(LayoutInflater.from(parent?.context).inflate(R.layout.item_kwnoledge, parent, false))
        }

        return holder
    }

    override fun getItemCount(): Int {
        return if(showBanner) itens.size + 1 else itens.size
    }

    override fun getItemViewType(position: Int): Int {
        if (showBanner){
            return when(position) {
                0 -> TYPE_BANNER
                else -> TYPE_DETAIL
            }
        } else {
            return TYPE_DETAIL
        }
    }

    abstract class KnowledgeHolder(view: View) : RecyclerView.ViewHolder(view) {
        abstract fun render(item: Knowledge?)
    }

    class KnowledgeDetailHolder(view: View) : KnowledgeHolder(view) {
        override fun render(iten: Knowledge?) {
            itemView.itTxtKnowledgeName.text = iten?.name
        }
    }

    class KnowledgeBannerHolder(view: View) : KnowledgeHolder(view) {
        override fun render(iten: Knowledge?) {
            itemView.banImgBanner.setImageResource(R.drawable.banner_progress)
        }
    }
}