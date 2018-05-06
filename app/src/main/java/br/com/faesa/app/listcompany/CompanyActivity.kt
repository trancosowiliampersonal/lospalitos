package br.com.faesa.app.listcompany

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import br.com.faesa.app.R
import br.com.faesa.app.listcareer.CareerFragment
import br.com.faesa.app.repository.REPOSITORY
import kotlinx.android.synthetic.main.activity_company.*

class CompanyActivity : AppCompatActivity() {

    val idCompany by lazy { intent.getLongExtra(EXTRA_ID_COMPANY, -1) }
    val company by lazy { REPOSITORY.COMPANY.ALL.firstOrNull { it.id == idCompany } }

    companion object {
        const val EXTRA_ID_COMPANY = "EXTRA_ID_COMPANY"

        fun newIntent(context: Context, idCompany:Long) : Intent {
            val intent = Intent(context, CompanyActivity::class.java)
            intent.putExtra(EXTRA_ID_COMPANY, idCompany)

            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_company)

        comLblCompany.text = company?.name
        comTxtDescription.text = company?.description

        supportFragmentManager.beginTransaction().add(R.id.comFlFragment, CareerFragment.newInstance(company?.id)).commit()
    }
}
