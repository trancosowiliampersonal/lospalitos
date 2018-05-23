package br.com.faesa.app.company

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.faesa.app.R
import br.com.faesa.app.domain.Company
import br.com.faesa.app.listcareer.ListCareerFragment
import kotlinx.android.synthetic.main.activity_company.*

class CompanyActivity : AppCompatActivity(), CompanyContract.View {
    override val presenter: CompanyContract.Presenter by lazy {
        CompanyPresenter().apply {
            this.view = this@CompanyActivity
        }
    }

    val idCompany by lazy { intent.getLongExtra(EXTRA_ID_COMPANY, -1) }

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

        presenter.loadCompany(idCompany)
    }

    override fun showLoadDialog() {}
    override fun dismissLoadDialog() {}

    override fun loadCompany(company: Company?) {
        comLblCompany.text = company?.name
        comTxtDescription.text = company?.description

        supportFragmentManager.beginTransaction().add(R.id.comFlFragment, ListCareerFragment.newInstance(company?.id)).commit()
    }
}
