package br.com.faesa.app.data.repository.remote

import br.com.faesa.app.data.model.KnowledgeSimple
import br.com.faesa.app.domain.ApiResponse

/**
 * @author wiliam
 * @date 5/31/18
 */
interface KnowledgeRepository {
    fun getAll(callback: (ApiResponse<List<KnowledgeSimple>>) -> Unit)
    fun getCareerKnowledges(idCareer: Long, callback: (ApiResponse<List<KnowledgeSimple>>) -> Unit)
}