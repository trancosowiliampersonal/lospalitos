package br.com.faesa.app.listknowledge

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.faesa.app.BaseFragment
import br.com.faesa.app.R
import br.com.faesa.app.domain.Knowledge
import br.com.faesa.app.listcareer.CareerActivity
import br.com.faesa.app.repository.REPOSITORY

/**
 * Created by wiliam on 5/5/18.
 */
class KnowledgeFragment : BaseFragment() {

    override val title: String = "Conhecimentos"

    var rec: RecyclerView? = null
    val adapter by lazy { KnowledgeAdapter(getItens()) }


    companion object {
        fun newInstance(): KnowledgeFragment {
            return KnowledgeFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view =  inflater?.inflate(R.layout.fragment_knowledge, container, false)

        rec = view?.findViewById<RecyclerView>(R.id.fknowRecKnowledges)
        rec?.layoutManager = LinearLayoutManager(context)
        rec?.adapter = adapter

        adapter.onClickListener = {
//            startActivity(CareerActivity.newIntent(context, it.id))
        }

        return view
    }

    private fun  getItens(): List<Knowledge> {
        return REPOSITORY.KNOWLEDGE.ALL
    }
}
