package br.com.faesa.app.main.listcompany

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.faesa.app.BaseFragment
import br.com.faesa.app.R
import br.com.faesa.app.company.CompanyActivity
import br.com.faesa.app.data.model.CompanySimple
import br.com.faesa.app.main.epoxy.CompanyController
import kotlinx.android.synthetic.main.fragment_company.*
import org.koin.android.ext.android.inject

/**
 * Created by wiliam on 5/5/18.
 */
class ListCompanyFragment : BaseFragment(), ListCompanyContract.View {

    override val title: String = "Empresas"
    override val presenter by inject<ListCompanyContract.Presenter>()

    val controller by lazy { CompanyController() }

    companion object {
        fun newInstance(): ListCompanyFragment {
            return ListCompanyFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_company, container, false)

        presenter.view = this
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setupListView()
    }

    override fun showLoadDialog() {}
    override fun dismissLoadDialog() {}

    override fun loadList(list: List<CompanySimple>) {
        controller.setData(list)
    }

    fun setupListView() {
        fcomRecCompanys.setController(controller)

        controller.listener = {
            startActivity(CompanyActivity.newIntent(context!!, it.id))
        }

        presenter.loadList()
    }
}