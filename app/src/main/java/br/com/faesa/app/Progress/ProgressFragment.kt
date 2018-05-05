package br.com.faesa.app.Progress

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.faesa.app.BaseFragment
import br.com.faesa.app.R

/**
 * Created by wiliam on 5/5/18.
 */
class ProgressFragment : BaseFragment() {

    override val title: String = "Progresso"

    companion object {
        fun newInstance(): ProgressFragment {
            return ProgressFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_progress, container, false)
    }
}