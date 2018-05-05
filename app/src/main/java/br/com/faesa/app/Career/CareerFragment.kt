package br.com.faesa.app.Career

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.faesa.app.BaseFragment
import br.com.faesa.app.R
import kotlinx.android.synthetic.main.fragment_carrer.*

/**
 * Created by wiliam on 5/5/18.
 */
class CareerFragment : BaseFragment() {

    override val title: String = "Carreiras"
    var carRecCareers:RecyclerView? = null

    companion object {
        fun newInstance(): CareerFragment {
            return CareerFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view =  inflater?.inflate(R.layout.fragment_carrer, container, false)

        carRecCareers = view?.findViewById<RecyclerView>(R.id.carRecCareers)
        carRecCareers?.layoutManager = LinearLayoutManager(context)
        carRecCareers?.adapter = CareerAdapter(getCareers())

        return view
    }

    private fun getCareers(): List<Career> {
        return listOf(
                Career("Dev Android"),
                Career("Dev Front end"),
                Career("Designer"),
                Career("Gerente de projetos")
        )
    }
}