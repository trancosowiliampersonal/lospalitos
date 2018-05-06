package br.com.faesa.app.listcompany

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.faesa.app.BaseFragment
import br.com.faesa.app.R
import br.com.faesa.app.domain.Company
import br.com.faesa.app.listcareer.CareerActivity
import br.com.faesa.app.repository.REPOSITORY

/**
 * Created by wiliam on 5/5/18.
 */
class CompanyFragment : BaseFragment() {

    override val title: String = "Empresas"

    var rec:RecyclerView? = null
    val adapter by lazy { CompanyAdapter(getItens()) }

    companion object {
        fun newInstance(): CompanyFragment {
            return CompanyFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view =  inflater?.inflate(R.layout.fragment_company, container, false)

        rec = view?.findViewById<RecyclerView>(R.id.fcomRecCompanys)
        rec?.layoutManager = LinearLayoutManager(context)
        rec?.adapter = adapter

        adapter.onClickListener = {
            startActivity(CareerActivity.newIntent(context, it.id))
        }

        return view
    }
    private fun  getItens(): List<Company> {
        return REPOSITORY.COMPANY.ALL
    }
}