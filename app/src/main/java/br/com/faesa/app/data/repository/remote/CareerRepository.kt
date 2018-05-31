package br.com.faesa.app.data.repository.remote

import br.com.faesa.app.data.model.CareerSimpleModel
import br.com.faesa.app.data.model.KnowledgeSimpleModel
import br.com.faesa.app.domain.ApiResponse

/**
 * @author wiliam
 * @date 5/31/18
 */
interface CareerRepository {
    fun getAll(callback:(ApiResponse<List<CareerSimpleModel>>) -> Unit)
    fun getCareerKnowledges(idCareer:Long, callback: (ApiResponse<List<KnowledgeSimpleModel>>) -> Unit)
}