package br.com.faesa.app.listcareer

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.faesa.app.BaseFragment
import br.com.faesa.app.R
import br.com.faesa.app.domain.Career
import br.com.faesa.app.registercareer.RegisterCareerActivity
import br.com.faesa.app.repository.REPOSITORY

/**
 * Created by wiliam on 5/5/18.
 */
class CareerFragment : BaseFragment() {

    override val title: String = "Carreiras"
    var carRecCareers:RecyclerView? = null
    val adapter by lazy { CareerAdapter(getCareers()) }

    companion object {
        fun newInstance(): CareerFragment {
            return CareerFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view =  inflater?.inflate(R.layout.fragment_carrer, container, false)

        carRecCareers = view?.findViewById<RecyclerView>(R.id.carRecCareers)
        carRecCareers?.layoutManager = LinearLayoutManager(context)
        carRecCareers?.adapter = adapter

        adapter.onClickListener = { (name) ->
            startActivity(Intent(context, RegisterCareerActivity::class.java))
        }

        return view
    }

    private fun getCareers(): List<Career> {
        return REPOSITORY.CAREER.ALL
    }
}