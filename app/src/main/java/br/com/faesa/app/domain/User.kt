package br.com.faesa.app.domain

import br.com.faesa.app.dao.Entity

/**
 * Created by wiliam on 5/5/18.
 */
data class User(
        override var id: Long,
        val name : String
): Entity