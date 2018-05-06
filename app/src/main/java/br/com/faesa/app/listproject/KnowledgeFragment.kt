package br.com.faesa.app.listproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.faesa.app.BaseFragment
import br.com.faesa.app.R

/**
 * Created by wiliam on 5/5/18.
 */
class KnowledgeFragment : BaseFragment() {

    override val title: String = "Conhecimentos"

    companion object {
        fun newInstance(): KnowledgeFragment {
            return KnowledgeFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_knowledge, container, false)
    }
}