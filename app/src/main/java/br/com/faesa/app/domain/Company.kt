package br.com.faesa.app.domain

import br.com.faesa.app.dao.Entity

/**
 * Created by wiliam on 5/5/18.
 */
data class Company(
        override var id: Long = 0,
        val name: String,
        val description: String
): Entity