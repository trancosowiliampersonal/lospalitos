package br.com.faesa.app.Career

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.faesa.app.R
import kotlinx.android.synthetic.main.item_career.view.*

/**
 * Created by wiliam on 5/5/18.
 */
class CareerAdapter(val careers : List<Career>) : RecyclerView.Adapter<CareerAdapter.CareerHolder>() {

    override fun onBindViewHolder(holder: CareerHolder?, position: Int) {
        holder?.txtName?.text = careers[position].name
    }

    override fun getItemCount(): Int {
        return careers.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CareerHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.item_career, parent, false)

        return CareerHolder(view)
    }


    class CareerHolder(view: View) : RecyclerView.ViewHolder(view){
        val txtName = view.itTxtCareerName
    }
}