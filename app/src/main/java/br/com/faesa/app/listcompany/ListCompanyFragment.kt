package br.com.faesa.app.listcompany

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.faesa.app.BaseFragment
import br.com.faesa.app.R
import br.com.faesa.app.company.CompanyActivity
import br.com.faesa.app.domain.Company
import kotlinx.android.synthetic.main.fragment_company.*

/**
 * Created by wiliam on 5/5/18.
 */
class ListCompanyFragment : BaseFragment(), ListCompanyContract.View {

    override val title: String = "Empresas"
    override val presenter: ListCompanyContract.Presenter by lazy {
        ListCompanyPresenter().apply {
            this.view = this@ListCompanyFragment
        }
    }

    val adapter: ListCompanyAdapter by lazy { ListCompanyAdapter() }

    companion object {
        fun newInstance(): ListCompanyFragment {
            return ListCompanyFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_company, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        setupListView()
    }

    override fun showLoadDialog() {}
    override fun dismissLoadDialog() {}

    override fun loadList(list: List<Company>) {
        adapter.itens = list
    }

    fun setupListView() {
        fcomRecCompanys.layoutManager = LinearLayoutManager(context)
        fcomRecCompanys.adapter = adapter

        adapter?.onClickListener = {
            startActivity(CompanyActivity.newIntent(context, it.id))
        }

        presenter.loadList()
    }
}