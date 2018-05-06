package br.com.faesa.app

import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.faesa.app.dao.*
import br.com.faesa.app.domain.Career
import br.com.faesa.app.domain.Company
import br.com.faesa.app.domain.CompanyCareer
import br.com.faesa.app.main.MainActivity

class LauncherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        object : AsyncTask<Unit, Unit, Unit>() {
            override fun onPreExecute() {
                this@LauncherActivity.deleteAppDatabase()
            }

            override fun doInBackground(vararg params: Unit?) {
                val company = CompanyDAO(this@LauncherActivity)[1]

                if (company == null) {
                    loadDatabase()
                }
            }

            override fun onPostExecute(result: Unit?) {
                startActivity(Intent(this@LauncherActivity, MainActivity::class.java))
                finish()
            }

        }.execute()
    }

    private fun loadDatabase() {
//        CompanyDAO(this).insert(
//                listOf(
//                        Company(1, "Autoglass", "Descricao"),
//                        Company(2, "Inflor", "Descricao"),
//                        Company(3, "Picpay", "Descricao"),
//                        Company(4, "Benevix", "Descricao"),
//                        Company(5, "Quality automação", "Descricao")
//                )
//        )
//
//        CareerDAO(this).insert(
//                listOf(
//                        Career(1, "Desenvolvedor Android", "Nesta carreira aprenda desenvolver aplicações android nativamente usando os recursos da API do sistema Google"),
//                        Career(2, "Desenvolvedor front-end", "Vá do baśico ao avançado nas tecnologias web e aprenda publicar seus sites"),
//                        Career(3, "UX-Designer", "Abreviação de User Experience ou “Experiência do Usuário”, em tradução literal) é responsável, como o próprio nome diz, por garantir que o design projetado atenda a todas as necessidades dos usuários"),
//                        Career(4, "Gerente de projetos", "Um gerente de projetos é um profissional no campo de gerência de projetos que tem a responsabilidade de planejar e controlar a execução de projetos em diversas áreas de atuação"),
//                        Career(5, "Analista de sistema", "O analista de sistemas é um profissional da área de tecnologia da informação (TI) especializado em desenvolver sistemas informatizados capazes de atender às necessidades e objetivos da organização ")
//                )
//        )
//
//        CompanyCareerDAO(this).insert(
//                CompanyCareer(1, 2),
//                CompanyCareer(1, 2)
//        )
    }
}
