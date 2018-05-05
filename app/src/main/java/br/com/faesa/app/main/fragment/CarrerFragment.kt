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
class CarrerFragment : BaseFragment() {

    override val title: String = "Carreiras"

    companion object {
        fun newInstance(): CarrerFragment {
            return CarrerFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_carrer, container, false)
    }
}