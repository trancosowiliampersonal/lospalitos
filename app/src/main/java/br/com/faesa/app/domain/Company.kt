package br.com.faesa.app.domain

/**
 * Created by wiliam on 5/5/18.
 */
data class Company(
        override var id: Long = 0,
        val name: String,
        val description: String,
        val careers: List<Career>,
        val knowledges: List<Project>
): Entity