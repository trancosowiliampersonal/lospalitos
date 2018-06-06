package br.com.faesa.app.career

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.faesa.app.R
import br.com.faesa.app.career.epoxy.KnowledgeController
import br.com.faesa.app.data.model.CareerWithKnowledges
import br.com.faesa.app.knowledge.KnowledgeActivity
import kotlinx.android.synthetic.main.activity_career.*
import org.koin.android.ext.android.inject

class CareerActivity : AppCompatActivity(), CareerContract.View {
    override val presenter by inject<CareerContract.Presenter>()

    val idCareer by lazy { intent.getLongExtra(EXTRA_ID, -1) }
    val controller by lazy { KnowledgeController() }

    companion object {
        const val EXTRA_ID = "EXTRA_ID"

        fun newIntent(context: Context, idCareer: Long): Intent {
            return Intent(context, CareerActivity::class.java).apply {
                putExtra(EXTRA_ID, idCareer)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_career)

        presenter.view = this
        presenter.loadCareer(idCareer)
    }

    override fun showLoadDialog() {}
    override fun dismissLoadDialog() {}

    override fun loadCareer(career: CareerWithKnowledges?) {
        carLblCareer.text = career?.name
        carTxtDescription.text = career?.description

        carRecKnowledges.setController(controller)
        controller.setData(career?.knowledges)
        controller.listener = {
            startActivity(KnowledgeActivity.newIntent(this, it.id))
        }

    }
}
