package br.com.faesa.app.knowledge

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Html
import android.text.method.LinkMovementMethod
import br.com.faesa.app.R
import br.com.faesa.app.domain.Knowledge
import kotlinx.android.synthetic.main.activity_knowledge.*
import org.koin.android.ext.android.inject

class KnowledgeActivity : AppCompatActivity(), KnowledgeContract.View {

    override val presenter by inject<KnowledgeContract.Presenter>()

    val idKnowledge by lazy { intent.getLongExtra(EXTRA_ID, -1) }

    companion object {
        const val EXTRA_ID = "EXTRA_ID"

        fun newIntent(context: Context, id: Long): Intent {
            return Intent(context, KnowledgeActivity::class.java).apply {
                putExtra(EXTRA_ID, id)

            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_knowledge)

        presenter.view = this
        presenter.loadKnowledge(idKnowledge)
    }

    override fun showLoadDialog() {}
    override fun dismissLoadDialog() {}

    override fun loadKnowledge(knowledge: Knowledge?) {
        knowLblKnowledge.text = knowledge?.name
        knowTxtDescription.text = Html.fromHtml(knowledge?.description)

        knowTxtDescription.movementMethod = LinkMovementMethod.getInstance()
    }
}
