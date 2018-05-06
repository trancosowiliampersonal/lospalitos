package br.com.faesa.app.listcareer

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.faesa.app.BaseFragment
import br.com.faesa.app.R
import br.com.faesa.app.domain.Career
import br.com.faesa.app.repository.REPOSITORY

/**
 * Created by wiliam on 5/5/18.
 */
class CareerFragment : BaseFragment() {

    override val title: String = "Carreiras"

    var carRecCareers:RecyclerView? = null
    val adapter by lazy { CareerAdapter(getCareers(), company == null) }
    val idCompany by lazy { this.arguments.getLong(EXTRA_ID, -1) }
    val company by lazy { if(idCompany > 0) REPOSITORY.COMPANY.ALL.firstOrNull{ it.id == idCompany} else null }

    companion object {

        const val EXTRA_ID = "EXTRA_ID"

        fun newInstance(id:Long? = -1): CareerFragment {
            val frag = CareerFragment()

            val bundle = Bundle()
            bundle.putLong(EXTRA_ID, id ?: -1)
            frag.arguments = bundle

            return frag
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view =  inflater?.inflate(R.layout.fragment_carrer, container, false)

        carRecCareers = view?.findViewById<RecyclerView>(R.id.carRecCareers)
        carRecCareers?.layoutManager = LinearLayoutManager(container?.context)
        carRecCareers?.adapter = adapter

        adapter.onClickListener = {
            startActivity(CareerActivity.newIntent(context, it.id))
        }

        return view
    }

    private fun getCareers(): List<Career> {
        return company?.let { it.careers } ?: REPOSITORY.CAREER.ALL
    }
}