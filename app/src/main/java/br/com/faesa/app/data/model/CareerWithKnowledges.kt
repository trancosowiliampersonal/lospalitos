package br.com.faesa.app.data.model

/**
 * @author wiliam
 * @date 5/31/18
 */
data class CareerWithKnowledges(
        val id: Long = 0,
        val name: String,
        val description: String,
        val knowledges:List<KnowledgeSimple>
)