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
import br.com.faesa.app.repository.REPOSITORY

/**
 * Created by wiliam on 5/5/18.
 */
class KnowledgeFragment : BaseFragment() {

    override val title: String = "Conhecimentos"

    var rec: RecyclerView? = null
    val adapter by lazy { KnowledgeAdapter(getItens(), career == null) }
    val idCareer by lazy { this.arguments.getLong(EXTRA_ID, -1) }
    val career by lazy { if(idCareer > 0) REPOSITORY.CAREER.ALL.firstOrNull{ it.id == idCareer} else null }

    companion object {

        const val EXTRA_ID = "EXTRA_ID"

        fun newInstance(id:Long? = -1): KnowledgeFragment {
            val frag =  KnowledgeFragment()

            val bundle = Bundle()
            bundle.putLong(EXTRA_ID, id ?: -1)
            frag.arguments = bundle

            return frag
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view =  inflater?.inflate(R.layout.fragment_knowledge, container, false)

        rec = view?.findViewById<RecyclerView>(R.id.fknowRecKnowledges)
        rec?.layoutManager = LinearLayoutManager(context)
        rec?.adapter = adapter

        adapter.onClickListener = {
//            startActivity(CompanyActivity.newIntent(context, it.id))
        }

        return view
    }

    private fun  getItens(): List<Knowledge> {
        return career?.let { it.knowledges } ?: REPOSITORY.KNOWLEDGE.ALL
    }
}
