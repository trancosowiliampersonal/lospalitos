package br.com.faesa.app.registercareer

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.faesa.app.R
import kotlinx.android.synthetic.main.item_register_knowledge.view.*

class KnowledgeAdapter(val listRegisterCareerItemKnowledge: List<RegisterCareerItemKnowledge>) : RecyclerView.Adapter<KnowledgeAdapter.KnowledgeHolder>() {

    override fun getItemCount() : Int {
        return listRegisterCareerItemKnowledge.size
    }

    override fun onBindViewHolder(holder: KnowledgeHolder?, position: Int) {
        holder?.txtName?.text = listRegisterCareerItemKnowledge[position].name
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): KnowledgeHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.item_register_knowledge, parent, false)
        val holder = KnowledgeHolder(view)
        return holder
    }

    class KnowledgeHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtName = view.itTxtKnowledgeName
    }
}