package br.com.faesa.app.main.listcareer

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.faesa.app.BaseFragment
import br.com.faesa.app.R
import br.com.faesa.app.career.CareerActivity
import br.com.faesa.app.data.model.CareerSimpleModel
import br.com.faesa.app.main.epoxy.CareerController
import kotlinx.android.synthetic.main.fragment_carrer.*
import org.koin.android.ext.android.inject

/**
 * Created by wiliam on 5/5/18.
 */
class ListCareerFragment : BaseFragment(), ListCareerContract.View {

    override val title: String = "Carreiras"
    override val presenter by inject<ListCareerContract.Presenter>()

    val controller by lazy { CareerController() }

    companion object {
        fun newInstance(): ListCareerFragment {
            return ListCareerFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view =  inflater?.inflate(R.layout.fragment_carrer, container, false)

        presenter.view = this
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setupListView()
    }

    override fun showLoadDialog() {}
    override fun dismissLoadDialog() {}

    override fun loadList(list: List<CareerSimpleModel>) {
        controller.setData(list)
    }

    fun setupListView() {
        carRecCareers?.setController(controller)

        controller.listener = {
            startActivity(CareerActivity.newIntent(context!!, it.id))
        }

        presenter.loadList()
    }
}