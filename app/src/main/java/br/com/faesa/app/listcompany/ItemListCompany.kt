package br.com.faesa.app.listcompany

import br.com.faesa.app.domain.Company

/**
 * Created by wiliam on 5/5/18.
 */
class ItemListCompany (val name:String, val description: String = "", val id : Long = 0) {

    companion object {
        fun newInstance(t:Company) : ItemListCompany {
            return ItemListCompany(t.name, t.description, t.id)
        }
    }
}