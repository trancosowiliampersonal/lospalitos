package br.com.faesa.app.listknowledge

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.method.LinkMovementMethod
import br.com.faesa.app.R
import br.com.faesa.app.repository.REPOSITORY
import kotlinx.android.synthetic.main.activity_knowledge.*

class KnowledgeActivity : AppCompatActivity() {

    val idKnowledge by lazy { intent.getLongExtra(EXTRA_ID, -1) }
    val knowledge by lazy { REPOSITORY.KNOWLEDGE.ALL.firstOrNull { it.id == idKnowledge } }

    companion object {
        const val EXTRA_ID = "EXTRA_ID"

        fun newIntent(context: Context, id:Long) : Intent {
            val intent = Intent(context, KnowledgeActivity::class.java)
            intent.putExtra(EXTRA_ID, id)

            return intent
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_knowledge)

        knowLblKnowledge.text = knowledge?.name
        knowTxtDescription.text = Html.fromHtml(knowledge?.description)

        knowTxtDescription.movementMethod = LinkMovementMethod.getInstance()
    }
}
