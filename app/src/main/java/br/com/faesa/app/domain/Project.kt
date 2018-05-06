package br.com.faesa.app.domain

/**
 * Created by wiliam on 5/5/18.
 */
data class Project (
        override var id: Long,
        val name: String,
        val description: String,
        val knowledges: List<Knowledge>,
        val users: List<User>
): Entity