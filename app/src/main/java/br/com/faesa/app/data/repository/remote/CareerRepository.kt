package br.com.faesa.app.data.repository.remote

import br.com.faesa.app.data.model.CareerSimple
import br.com.faesa.app.data.model.CareerWithKnowledges
import br.com.faesa.app.data.model.KnowledgeSimple
import br.com.faesa.app.domain.ApiResponse

/**
 * @author wiliam
 * @date 5/31/18
 */
interface CareerRepository {
    fun getAll(callback:(ApiResponse<List<CareerSimple>>) -> Unit)
    fun get(idCareer: Long, callback: (ApiResponse<CareerWithKnowledges>) -> Unit)
    fun getCompanyCareers(idCompany: Long, callback: (ApiResponse<List<CareerSimple>>) -> Unit)
    fun getCareerKnowledges(idCareer:Long, callback: (ApiResponse<List<KnowledgeSimple>>) -> Unit)
}