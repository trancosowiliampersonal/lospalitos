package br.com.faesa.app.listcareer

import br.com.faesa.app.domain.Career

/**
 * Created by wiliam on 5/5/18.
 */
data class ItemListCareer(val name:String, val description: String = "", val id : Long = 0) {

    companion object {
        fun newInstance(career:Career) : ItemListCareer {
            return ItemListCareer(career.name, career.description, career.id)
        }

        fun newInstances(list: List<Career>): List<ItemListCareer> {
            return list.map {
                ItemListCareer(it.name, it.description,it.id)
            }
        }
    }
}