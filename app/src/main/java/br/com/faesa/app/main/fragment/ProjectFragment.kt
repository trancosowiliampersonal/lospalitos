package br.com.faesa.app.main.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.faesa.app.BaseFragment
import br.com.faesa.app.R

/**
 * Created by wiliam on 5/5/18.
 */
class ProjectFragment : BaseFragment() {

    override val title: String = "Projetos"

    companion object {
        fun newInstance(): ProjectFragment {
            return ProjectFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_project, container, false)
    }
}