package br.com.faesa.app.listcareer

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import br.com.faesa.app.BaseFragment
import br.com.faesa.app.R

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
            Toast.makeText(context, name, Toast.LENGTH_SHORT).show()
        }

        return view
    }

    private fun getCareers(): List<Career> {
        return listOf(
                Career("Dev Android"),
                Career("Dev Front end"),
                Career("Designer"),
                Career("Gerente de projetos"),
                Career("Analista de sistema"),
                Career("Dev Front end"),
                Career("Designer"),
                Career("Gerente de projetos"),
                Career("Analista de sistema"),
                Career("Dev Front end"),
                Career("Designer"),
                Career("Gerente de projetos"),
                Career("Analista de sistema"),
                Career("Dev Front end"),
                Career("Designer"),
                Career("Gerente de projetos"),
                Career("Analista de sistema")
        )
    }
}