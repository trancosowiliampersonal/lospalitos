package br.com.faesa.app.domain

import br.com.faesa.app.dao.Entity

/**
 * Created by wiliam on 5/5/18.
 */
data class Project (
        override var id: Long,
        val name: String,
        val description: String,
        val users: List<User>
): Entity