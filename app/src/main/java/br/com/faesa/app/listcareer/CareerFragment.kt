package br.com.faesa.app.listcareer

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.faesa.app.BaseFragment
import br.com.faesa.app.R
import br.com.faesa.app.registercareer.RegisterCareerActivity

/**
 * Created by wiliam on 5/5/18.
 */
class CareerFragment : BaseFragment() {

    override val title: String = "Carreiras"
    var carRecCareers:RecyclerView? = null
    val adapter by lazy { CareerAdapter(getCareers()) }

    companion object {
        fun newInstance(): CareerFragment {
            return CareerFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view =  inflater?.inflate(R.layout.fragment_carrer, container, false)

        carRecCareers = view?.findViewById<RecyclerView>(R.id.carRecCareers)
        carRecCareers?.layoutManager = LinearLayoutManager(context)
        carRecCareers?.adapter = adapter

        adapter.onClickListener = { (name) ->
            startActivity(Intent(context, RegisterCareerActivity::class.java))
        }

        return view
    }

    private fun getCareers(): List<ItemListCareer> {
        return listOf(
            ItemListCareer("Desenvolvedor Android", "Nesta carreira aprenda desenvolver aplicações android nativamente usando os recursos da API do sistema Google"),
            ItemListCareer("Desenvolvedor front-end", "Vá do baśico ao avançado nas tecnologias web e aprenda publicar seus sites"),
            ItemListCareer("UX-Designer", "Abreviação de User Experience ou “Experiência do Usuário”, em tradução literal) é responsável, como o próprio nome diz, por garantir que o design projetado atenda a todas as necessidades dos usuários"),
            ItemListCareer("Gerente de projetos", "Um gerente de projetos é um profissional no campo de gerência de projetos que tem a responsabilidade de planejar e controlar a execução de projetos em diversas áreas de atuação"),
            ItemListCareer("Analista de sistema", "O analista de sistemas é um profissional da área de tecnologia da informação (TI) especializado em desenvolver sistemas informatizados capazes de atender às necessidades e objetivos da organização ")
        )
    }
}