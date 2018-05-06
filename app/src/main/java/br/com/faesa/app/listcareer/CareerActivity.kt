package br.com.faesa.app.listcareer

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import br.com.faesa.app.R

class CareerActivity : AppCompatActivity() {

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
    }
}
