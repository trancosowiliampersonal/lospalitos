package br.com.faesa.app.repository

import br.com.faesa.app.domain.*

/**
 * Created by wiliam on 5/6/18.
 */
object REPOSITORY {

    object KNOWLEDGE {
        val SCRUM = Knowledge(1, "SCRUM")
        val MUDAR = Knowledge(2, "MUDAR")
        val MUDAR_2 = Knowledge(3, "MUDAR")

        val ALL = listOf<Knowledge>(SCRUM, MUDAR, MUDAR_2)
    }

    object KNOWLEDGE_LIST {
        val LIST_1 = listOf<Knowledge>(KNOWLEDGE.SCRUM, KNOWLEDGE.MUDAR)
        val LIST_2 = listOf<Knowledge>(KNOWLEDGE.SCRUM, KNOWLEDGE.MUDAR, KNOWLEDGE.MUDAR_2)
        val LIST_3 = listOf<Knowledge>(KNOWLEDGE.MUDAR)
    }

    object USER {
        val KEOMA = User(1, "Keoma")
        val JEFFERSON = User(2, "Jefferson")
        val ESTER = User(3, "Ester")

        val ALL = listOf<User>(KEOMA, JEFFERSON, ESTER)
    }

    object USER_LIST {
        val LIST_1 = listOf<User>(USER.KEOMA, USER.JEFFERSON)
        val LIST_2 = listOf<User>(USER.KEOMA, USER.JEFFERSON, USER.ESTER)
        val LIST_3 = listOf<User>(USER.ESTER)
    }

    object PROJECT {
        val APLICATIVO_ANDROID = Project(1, "Aplicativo android", "Aplicação nativa", KNOWLEDGE_LIST.LIST_1, USER_LIST.LIST_2)
        val TESTE_DESINER_E_UX = Project(1, "Teste usabilidade", "BlaBlaBlaBlaBla BlaBlaBlaBlaBlaBlaBlaBlaBlaBla BlaBlaBlaBlaBla", KNOWLEDGE_LIST.LIST_2, USER_LIST.LIST_1)
        val CONHECIMENTOS_BASICOS = Project(1, "Base", "BlaBlaBlaBlaBla BlaBlaBlaBlaBlaBlaBlaBlaBlaBla BlaBlaBlaBlaBla", KNOWLEDGE_LIST.LIST_1, USER_LIST.LIST_3)


        val ALL = listOf<Project>(APLICATIVO_ANDROID, TESTE_DESINER_E_UX, CONHECIMENTOS_BASICOS)
    }

    object PROJECT_LIST {
        val PROJETOS_AUTOGLASS = listOf<Project>(PROJECT.APLICATIVO_ANDROID, PROJECT.TESTE_DESINER_E_UX)
        val PROJETOS_INFLOR = listOf<Project>(PROJECT.CONHECIMENTOS_BASICOS, PROJECT.TESTE_DESINER_E_UX)
    }

    object CAREER {
        val DEV_ANDROID = Career(1, "Desenvolvedor Android", "Nesta carreira aprenda desenvolver aplicações android nativamente usando os recursos da API do sistema Google", KNOWLEDGE_LIST.LIST_3 )
        val MUDAR = Career(2, "MUDAR", "MUDAR", KNOWLEDGE_LIST.LIST_3)

        val ALL = listOf<Career>(DEV_ANDROID, MUDAR)

    }

    object CAREER_LIST {
        val CARREIRAS_AUTOGLASS = listOf<Career>(CAREER.DEV_ANDROID)
        val CARREIRAS_INFLOR = listOf<Career>(CAREER.MUDAR, CAREER.DEV_ANDROID)
    }

    object COMPANY {
        val AUTOGLASS = Company(1, "Autoglass", "Descricao", CAREER_LIST.CARREIRAS_AUTOGLASS, PROJECT_LIST.PROJETOS_AUTOGLASS)
        val INFLOR = Company(2, "Inflor", "Descricao", CAREER_LIST.CARREIRAS_INFLOR, PROJECT_LIST.PROJETOS_INFLOR)
        
        val ALL = listOf<Company>(AUTOGLASS, INFLOR)
    }
}