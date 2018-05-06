package br.com.faesa.app.domain

/**
 * Created by wiliam on 5/5/18.
 */
data class User(
        override var id: Long,
        val name : String
): Entity