package br.com.faesa.app.career

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import br.com.faesa.app.R
import br.com.faesa.app.domain.Knowledge
import kotlinx.android.synthetic.main.activity_career.*

class CareerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_career)

        carRecList.layoutManager = LinearLayoutManager(this)
        carRecList.adapter = KnowledgeAdapter(createKnowledge())
    }

    fun createKnowledge() : List<Knowledge>{
        return listOf(
                Knowledge("Scrum"),
                Knowledge("Trello"),
                Knowledge("Git"),
                Knowledge("Java"),
                Knowledge("API Android")
        )
    }
}
