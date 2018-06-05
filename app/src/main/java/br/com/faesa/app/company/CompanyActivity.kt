package br.com.faesa.app.company

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.faesa.app.R
import br.com.faesa.app.company.epoxy.CareerController
import br.com.faesa.app.data.model.CompanyWithCareersModel
import kotlinx.android.synthetic.main.activity_company.*
import org.koin.android.ext.android.inject

class CompanyActivity : AppCompatActivity(), CompanyContract.View {
    override val presenter by inject<CompanyContract.Presenter>()

    val idCompany by lazy { intent.getLongExtra(EXTRA_ID_COMPANY, -1) }
    val controller by lazy { CareerController() }

    companion object {
        const val EXTRA_ID_COMPANY = "EXTRA_ID_COMPANY"

        fun newIntent(context: Context, idCompany: Long): Intent {
            val intent = Intent(context, CompanyActivity::class.java)
            intent.putExtra(EXTRA_ID_COMPANY, idCompany)

            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_company)

        presenter.view = this
        presenter.loadCompany(idCompany)
    }

    override fun showLoadDialog() {}
    override fun dismissLoadDialog() {}

    override fun loadCompany(company: CompanyWithCareersModel) {
        comLblCompany.text = company?.name
        comTxtDescription.text = company?.description

        comRecCareers.setController(controller)
        controller.setData(company.careers)

    }
}
