package br.com.faesa.app.data.repository.remote

import br.com.faesa.app.domain.Company
import br.com.faesa.app.domain.ApiResponse

/**
 * @author wiliam
 * @date 5/30/18
 */
interface CompanyRepository {
    fun get(idCompany:Long, callback:(ApiResponse<Company>) -> Unit)
    fun getAll(callback:(ApiResponse<List<Company>>) -> Unit)
}