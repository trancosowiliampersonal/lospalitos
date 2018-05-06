package br.com.faesa.app.listcareer

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.faesa.app.R
import br.com.faesa.app.domain.Career
import kotlinx.android.synthetic.main.banner.view.*
import kotlinx.android.synthetic.main.item_career.view.*

/**
 * Created by wiliam on 5/5/18.
 */
class CareerAdapter(val careerListCareers: List<Career>, val showBanner: Boolean = true) : RecyclerView.Adapter<CareerAdapter.CareerHolder>() {

    var onClickListener: ((Career) -> Unit)? = null

    companion object {
        const val TYPE_BANNER = 0
        const val TYPE_DETAIL = 1
    }

    override fun onBindViewHolder(holder: CareerHolder?, position: Int) {
        val pos = if(showBanner) position - 1 else position
        holder?.render(careerListCareers.elementAtOrNull(pos))

        (holder as? CareerDetailHolder)?.itemView?.setOnClickListener {
            onClickListener?.invoke(careerListCareers[pos])
        }
    }

    override fun getItemCount(): Int {
        return if(showBanner) careerListCareers.size + 1 else careerListCareers.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CareerHolder {

        val holder = when(viewType) {
            TYPE_BANNER -> CareerBannerHolder(LayoutInflater.from(parent?.context).inflate(R.layout.banner, parent, false))
            else -> CareerDetailHolder(LayoutInflater.from(parent?.context).inflate(R.layout.item_career, parent, false))
        }

        return holder
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


    abstract class CareerHolder(view: View) : RecyclerView.ViewHolder(view) {
        abstract fun render(careerListCareer: Career?)
    }

    class CareerDetailHolder(view: View) : CareerHolder(view) {
        override fun render(careerListCareer: Career?) {
            itemView.itTxtCareerName.text = careerListCareer?.name
            itemView.itTxtCareerDescription.text = careerListCareer?.description
        }
    }

    class CareerBannerHolder(view: View) : CareerHolder(view) {
        override fun render(careerListCareer: Career?) {
            itemView.banImgBanner.setImageResource(R.drawable.banner_career)
        }

    }


}