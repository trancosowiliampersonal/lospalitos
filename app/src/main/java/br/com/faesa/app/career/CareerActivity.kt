package br.com.faesa.app.career

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.faesa.app.R
import br.com.faesa.app.company.CareerContract
import br.com.faesa.app.company.CareerPresenter
import br.com.faesa.app.company.CompanyContract
import br.com.faesa.app.company.CompanyPresenter
import br.com.faesa.app.domain.Career
import br.com.faesa.app.domain.Company
import br.com.faesa.app.listknowledge.KnowledgeFragment
import br.com.faesa.app.repository.REPOSITORY
import kotlinx.android.synthetic.main.activity_career.*

class CareerActivity : AppCompatActivity(), CareerContract.View {

    override val presenter: CareerContract.Presenter by lazy {
        CareerPresenter().apply {
            this.view = this@CareerActivity
        }
    }

    val idCareer by lazy { intent.getLongExtra(EXTRA_ID, -1) }

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

        presenter.loadCareer(idCareer)
    }

    override fun showLoadDialog() {}
    override fun dismissLoadDialog() {}

    override fun loadCareer(career: Career?) {
        carLblCareer.text = career?.name
        carTxtDescription.text = career?.description

        supportFragmentManager.beginTransaction().add(R.id.carFlFragment, KnowledgeFragment.newInstance(career?.id)).commit()
    }
}
