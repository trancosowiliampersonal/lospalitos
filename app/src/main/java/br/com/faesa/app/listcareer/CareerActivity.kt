package br.com.faesa.app.listcareer

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.faesa.app.R
import br.com.faesa.app.listknowledge.KnowledgeFragment
import br.com.faesa.app.repository.REPOSITORY
import kotlinx.android.synthetic.main.activity_career.*

class CareerActivity : AppCompatActivity() {

    val idCareer by lazy { intent.getLongExtra(EXTRA_ID, -1) }
    val career by lazy { REPOSITORY.CAREER.ALL.firstOrNull { it.id == idCareer } }

    companion object {
        const val EXTRA_ID = "EXTRA_ID"

        fun newIntent(context: Context, idCareer:Long) : Intent {
            val intent = Intent(context, CareerActivity::class.java)
            intent.putExtra(EXTRA_ID, idCareer)

            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_career)

        carLblCareer.text = career?.name
        carTxtDescription.text = career?.description

        supportFragmentManager.beginTransaction().add(R.id.carFlFragment, KnowledgeFragment.newInstance(career?.id)).commit()
    }
}
