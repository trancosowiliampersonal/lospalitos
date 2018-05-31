package br.com.faesa.app.domain

/**
 * @author wiliam
 * @date 5/30/18
 */
data class Company(
        var id: Long = 0,
        val name: String,
        val description: String,
        val careers: List<Long>,
        val knowledges: List<Long>
)