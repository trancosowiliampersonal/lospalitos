package br.com.faesa.app.registercareer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import br.com.faesa.app.R
import kotlinx.android.synthetic.main.activity_career.*

class RegisterCareerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_career)

        carRecList.layoutManager = LinearLayoutManager(this)
        carRecList.adapter = KnowledgeAdapter(createKnowledge())
    }

    fun createKnowledge() : List<RegisterCareerItemKnowledge>{
        return listOf(
                RegisterCareerItemKnowledge("Scrum"),
                RegisterCareerItemKnowledge("Trello"),
                RegisterCareerItemKnowledge("Git"),
                RegisterCareerItemKnowledge("Java"),
                RegisterCareerItemKnowledge("API Android")
        )
    }
}
