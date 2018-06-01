package br.com.faesa.app.listknowledge

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.faesa.app.BaseFragment
import br.com.faesa.app.R
import br.com.faesa.app.data.model.KnowledgeSimpleModel
import br.com.faesa.app.domain.Knowledge
import br.com.faesa.app.knowledge.KnowledgeActivity
import kotlinx.android.synthetic.main.fragment_knowledge.*
import org.koin.android.ext.android.inject

/**
 * Created by wiliam on 5/5/18.
 */
class ListKnowledgeFragment : BaseFragment(), ListKnowledgeContract.View {

    override val title: String = "Conhecimentos"
    override val presenter by inject<ListKnowledgeContract.Presenter>()

    val adapter by lazy { ListKnowledgeAdapter(idCareer <= 0) }
    val idCareer by lazy { this.arguments!!.getLong(EXTRA_ID, -1) }

    companion object {

        const val EXTRA_ID = "EXTRA_ID"

        fun newInstance(id: Long? = -1): ListKnowledgeFragment {
            return ListKnowledgeFragment().apply {
                arguments = Bundle().apply {
                    putLong(EXTRA_ID, id ?: -1)
                }
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_knowledge, container, false)
        presenter.view = this

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setupListView()
    }

    override fun showLoadDialog() {}
    override fun dismissLoadDialog() {}

    override fun loadList(list: List<KnowledgeSimpleModel>) {
        adapter.itens = list
    }

    fun setupListView() {
        fknowRecKnowledges?.layoutManager = LinearLayoutManager(context)
        fknowRecKnowledges?.adapter = adapter

        adapter.onClickListener = {
            startActivity(KnowledgeActivity.newIntent(context!!, it.id))
        }

        presenter.loadList(idCareer)
    }
}
