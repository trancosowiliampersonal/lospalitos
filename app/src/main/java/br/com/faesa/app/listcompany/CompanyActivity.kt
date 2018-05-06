package br.com.faesa.app.listcareer

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import br.com.faesa.app.R
import br.com.faesa.app.repository.REPOSITORY
import kotlinx.android.synthetic.main.activity_career.*

class CareerActivity : AppCompatActivity() {

    val idCompany by lazy { intent.getLongExtra(EXTRA_ID_COMPANY, -1) }
    val career by lazy { REPOSITORY.COMPANY.ALL.firstOrNull { it.id == idCompany } }

    companion object {
        const val EXTRA_ID_COMPANY = "EXTRA_ID_COMPANY"

        fun newIntent(context: Context, idCompany:Long) : Intent {
            val intent = Intent(context, CareerActivity::class.java)
            intent.putExtra(EXTRA_ID_COMPANY, idCompany)

            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_career)

        carLblCompany.text = career?.name
        carTxtDescription.text = career?.description
    }
}
