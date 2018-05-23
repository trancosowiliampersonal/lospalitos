package br.com.faesa.app.listcareer

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.faesa.app.BaseFragment
import br.com.faesa.app.R
import br.com.faesa.app.career.CareerActivity
import br.com.faesa.app.domain.Career
import kotlinx.android.synthetic.main.fragment_carrer.*
import org.koin.android.ext.android.inject

/**
 * Created by wiliam on 5/5/18.
 */
class ListCareerFragment : BaseFragment(), ListCareerContract.View {

    override val title: String = "Carreiras"
    override val presenter: ListCareerContract.Presenter by inject()

    val adapter by lazy { ListCareerAdapter(idCompany <= 0) }
    val idCompany by lazy { this.arguments.getLong(EXTRA_ID, -1) }

    companion object {

        const val EXTRA_ID = "EXTRA_ID"

        fun newInstance(id: Long? = -1): ListCareerFragment {
            return ListCareerFragment().apply {
                arguments = Bundle().apply {
                    putLong(EXTRA_ID, id ?: -1)
                }
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view =  inflater?.inflate(R.layout.fragment_carrer, container, false)

        presenter.view = this
        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        setupListView()
    }

    override fun showLoadDialog() {}
    override fun dismissLoadDialog() {}

    override fun loadList(list: List<Career>) {
        adapter.itens = list
    }

    fun setupListView() {
        carRecCareers?.layoutManager = LinearLayoutManager(context)
        carRecCareers?.adapter = adapter

        adapter.onClickListener = {
            startActivity(CareerActivity.newIntent(context, it.id))
        }

        presenter.loadList(idCompany)
    }
}