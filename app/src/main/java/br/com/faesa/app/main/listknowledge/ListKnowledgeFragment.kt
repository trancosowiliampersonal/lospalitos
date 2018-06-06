package br.com.faesa.app.main.listknowledge

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.faesa.app.BaseFragment
import br.com.faesa.app.R
import br.com.faesa.app.data.model.KnowledgeSimple
import br.com.faesa.app.ext.dismiss
import br.com.faesa.app.ext.show
import br.com.faesa.app.knowledge.KnowledgeActivity
import br.com.faesa.app.main.epoxy.KnowledgeController
import br.com.faesa.app.view.dialog.LoadDialog
import kotlinx.android.synthetic.main.fragment_knowledge.*
import org.koin.android.ext.android.inject

/**
 * Created by wiliam on 5/5/18.
 */
class ListKnowledgeFragment : BaseFragment(), ListKnowledgeContract.View {

    override val title: String = "Conhecimentos"
    override val presenter by inject<ListKnowledgeContract.Presenter>()

    val controller by lazy { KnowledgeController() }

    companion object {
        fun newInstance(): ListKnowledgeFragment {
            return ListKnowledgeFragment()
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

    override fun showLoadDialog() {
        fknowProg.show()
        fknowRecKnowledges.dismiss()
    }

    override fun dismissLoadDialog() {
        fknowProg.dismiss()
        fknowRecKnowledges.show()
    }

    override fun loadList(list: List<KnowledgeSimple>) {
        controller.setData(list)
    }

    fun setupListView() {
        fknowRecKnowledges.setController(controller)

        controller.listener = {
            startActivity(KnowledgeActivity.newIntent(context!!, it.id))
        }

        presenter.loadList()
    }
}
