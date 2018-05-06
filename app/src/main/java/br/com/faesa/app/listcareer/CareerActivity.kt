package br.com.faesa.app.listcareer

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.faesa.app.R
import br.com.faesa.app.repository.REPOSITORY
import kotlinx.android.synthetic.main.activity_career.*

class CareerActivity : AppCompatActivity() {

    val idCareer by lazy { intent.getLongExtra(EXTRA_ID_COMPANY, -1) }
    val career by lazy { REPOSITORY.CAREER.ALL.firstOrNull { it.id == idCareer } }

    companion object {
        const val EXTRA_ID_COMPANY = "EXTRA_ID_COMPANY"

        fun newIntent(context: Context, idCareer:Long) : Intent {
            val intent = Intent(context, CareerActivity::class.java)
            intent.putExtra(EXTRA_ID_COMPANY, idCareer)

            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_career)

        carLblCareer.text = career?.name
        carTxtDescription.text = career?.description

//        supportFragmentManager.beginTransaction().add(R.id.comFlFragment, CareerFragment.newInstance(career?.id)).commit()
    }
}
