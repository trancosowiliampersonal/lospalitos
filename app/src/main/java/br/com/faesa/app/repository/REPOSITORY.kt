package br.com.faesa.app.repository

import br.com.faesa.app.domain.*

/**
 * Created by wiliam on 5/6/18.
 */
object REPOSITORY {

    object KNOWLEDGE {
        val SCRUM = Knowledge(1 ,"scrum")
        val FEATUREDRIVENDEVELOPMENT = Knowledge(2, "Feature Driven Development (FDD)")
        val EXTREMEPROGRAMMING = Knowledge(3, "eXtreme Programming (XP)")
        val MICROSOFTSOLUTIONSFRAMEWORK = Knowledge(4, "Microsoft Solutions Framework (MSF)")
        val DYNAMICSYSTEMDEVELOPMENTMODEL = Knowledge(5, "Dynamic System Development Model (DSDM)")
        val GIT = Knowledge(6 ,"git")
        val SVN = Knowledge(7 ,"svn")
        val CVS = Knowledge(8 ,"cvs")
        val SOURCETREE = Knowledge(9 ,"sourcetree")
        val GITHUB = Knowledge(10 ,"github")
        val GITLAB = Knowledge(11 ,"gitlab")
        val BITBUCKET = Knowledge(12 ,"bitbucket")
        val AGILE = Knowledge(13 ,"Agile")
        val TRELLO = Knowledge(14 ,"trello")
        val JYRA = Knowledge(15 ,"jyra")
        val PIPEFY = Knowledge(16 ,"pipefy")
        val REDMINE = Knowledge(17 ,"redmine")
        val JAVA = Knowledge(18 ,"java")
        val CSHARP = Knowledge(19 ,"c#")
        val JAVASCRIPT = Knowledge(20 ,"javascript")
        val ANGULARJS = Knowledge(21 ,"angularjs")
        val DELPHI = Knowledge(22 ,"delphi")
        val MVC = Knowledge(23 ,"mvc")
        val MVP = Knowledge(24 ,"mvp")
        val MVVM = Knowledge(25 ,"mvvm")
        val DDD = Knowledge(26 ,"ddd")
        val ILUSTRATOR = Knowledge(27 ,"ilustrator")
        val PHOTOSHOP = Knowledge(28 ,"photoshop")
        val SKETCHUP = Knowledge(29 ,"sketchup")
        val USABILIDADE = Knowledge(30 ,"usabilidade")
        val ZEPLIN = Knowledge(31 ,"zeplin")
        val NINJAMOCK = Knowledge(32 ,"ninjamock")
        val TDD = Knowledge(33 ,"TDD")
        val PROGRAMACAOEMPAR = Knowledge(34 ,"Programação em Par")
        val TESTEUNITARIO = Knowledge(35 ,"Teste Unitario")
        val TESTEDEINTEGRACAO = Knowledge(36 ,"teste de integração")
        val ALL = listOf<Knowledge>(SCRUM,FEATUREDRIVENDEVELOPMENT,EXTREMEPROGRAMMING,MICROSOFTSOLUTIONSFRAMEWORK,DYNAMICSYSTEMDEVELOPMENTMODEL,GIT,SVN,CVS,SOURCETREE,GITHUB,GITLAB,BITBUCKET,AGILE,TRELLO,JYRA,PIPEFY,REDMINE,JAVA,CSHARP,JAVASCRIPT,ANGULARJS,DELPHI,MVC,MVP,MVVM,DDD,ILUSTRATOR,PHOTOSHOP,SKETCHUP,USABILIDADE,ZEPLIN,NINJAMOCK,TDD,PROGRAMACAOEMPAR,TESTEUNITARIO,TESTEDEINTEGRACAO)
    }

    object KNOWLEDGE_LIST {
        val LIST_1 = listOf<Knowledge>(KNOWLEDGE.SCRUM, KNOWLEDGE.TESTEDEINTEGRACAO)
        val LIST_2 = listOf<Knowledge>(KNOWLEDGE.SCRUM, KNOWLEDGE.TESTEDEINTEGRACAO, KNOWLEDGE.ILUSTRATOR)
        val LIST_3 = listOf<Knowledge>(KNOWLEDGE.TESTEUNITARIO)
    }

    object USER {
        val KEOMA = User(1, "Keoma")
        val JEFFERSON = User(2, "Jefferson")
        val ESTER = User(3, "Ester")
        val VALDINEIJUVENCIO = User(4, "valdinei.juvencio")
        val JOICYQUIDICOMO = User(5, "joicyquidicomo")
        val LAIZENOBREGA = User(6, "laizenobrega")
        val JOSEKATYUCE = User(7, "jose.cynara.katyuce")
        val EDMARINEDATTEIN = User(8, "edmarine.castegnara.dattein")
        val FRANCIELLENMARCELINA = User(9, "franciellencollopymarcelina")
        val DOMITILAVAVASSORI = User(10, "domitila.xx.vavassori")
        val ALESSANDRAISAAC = User(11, "alessandra.ely.isaac")
        val NICOLLERICARDO = User(12, "nicollericardo")
        val JACOBSWARTELE = User(13, "jacobswartele")
        val MORRISFRANCO = User(14, "morris.franco")
        val ELOISALUND = User(15, "eloisa.lund")
        val CLEIZIENEBERTAGNONI = User(16, "cleiziene.bertagnoni")
        val JOILVALLE = User(17, "joil.valle")
        val KAMILARIPER = User(18, "kamilariper")
        val VITORSTEINMANN = User(19, "vitor.steinmann")
        val VALDIRLENEWILLIAM = User(20, "valdirlenewilliam")
        val ALEANDRAABDON = User(21, "aleandra.cassia.abdon")
        val SANDRORESTUM = User(22, "sandro.valerii.restum")
        val ALANBALBO = User(23, "alangascobalbo")
        val JANYCARPINTEIRO = User(24, "jany.carpinteiro")
        val WESLEYSOUZS = User(25, "wesley.souzs")
        val FRANKPAUPERIO = User(26, "frank.sabrina.pauperio")
        val BENEDITODIONEI = User(27, "benedito.calheiros.dionei")
        val VIXPARKLESSA = User(28, "vixpark.lessa")
        val STEFANIBRUNHARA = User(29, "stefani.prara.brunhara")
        val ELIZANDRASOSSELLA = User(30, "elizandra.luziane.sossella")
        val MARILDAREGIANI = User(31, "marildaregiani")
        val ROSEMARYGOYANNA = User(32, "rosemary.goyanna")
        val KELIANIMAKUCH = User(33, "kelianikettenmakuch")
        val ZEINYBRANDES = User(34, "zeiny.brandes")
        val GREZIELEPREIRA = User(35, "greziele.amanti.preira")
        val WALDEIAMELONE = User(36, "waldeia.melone")

        val ALL =  listOf<User>(KEOMA,JEFFERSON,ESTER,VALDINEIJUVENCIO,JOICYQUIDICOMO,LAIZENOBREGA,JOSEKATYUCE,EDMARINEDATTEIN,FRANCIELLENMARCELINA,DOMITILAVAVASSORI,ALESSANDRAISAAC,NICOLLERICARDO,JACOBSWARTELE,MORRISFRANCO,ELOISALUND,CLEIZIENEBERTAGNONI,JOILVALLE,KAMILARIPER,VITORSTEINMANN,VALDIRLENEWILLIAM,ALEANDRAABDON,SANDRORESTUM,ALANBALBO,JANYCARPINTEIRO,WESLEYSOUZS,FRANKPAUPERIO,BENEDITODIONEI,VIXPARKLESSA,STEFANIBRUNHARA,ELIZANDRASOSSELLA,MARILDAREGIANI,ROSEMARYGOYANNA,KELIANIMAKUCH,ZEINYBRANDES,GREZIELEPREIRA,WALDEIAMELONE)
    }

    object USER_LIST {
        val LIST_1 = listOf<User>(USER.KEOMA, USER.JEFFERSON)
        val LIST_2 = listOf<User>(USER.KEOMA, USER.JEFFERSON, USER.ESTER)
        val LIST_3 = listOf<User>(USER.ESTER)
        val LIST_4 = listOf<User>(USER.KELIANIMAKUCH, USER.STEFANIBRUNHARA, USER.ESTER, USER.DOMITILAVAVASSORI)
        val LIST_5 = listOf<User>(USER.ELIZANDRASOSSELLA, USER.JOSEKATYUCE, USER.CLEIZIENEBERTAGNONI, USER.FRANCIELLENMARCELINA, USER.ESTER)
        val LIST_6 = listOf<User>(USER.ESTER, USER.ROSEMARYGOYANNA, USER.JOILVALLE, USER.FRANCIELLENMARCELINA, USER.DOMITILAVAVASSORI)
        val LIST_7 = listOf<User>(USER.ROSEMARYGOYANNA, USER.ALESSANDRAISAAC, USER.JEFFERSON)
        val LIST_8 = listOf<User>(USER.ROSEMARYGOYANNA, USER.MARILDAREGIANI, USER.ESTER, USER.BENEDITODIONEI, USER.DOMITILAVAVASSORI)
    }

    object PROJECT {
        val APLICATIVO_ANDROID = Project(1, "Aplicativo android", "Aplicação nativa", KNOWLEDGE_LIST.LIST_1, USER_LIST.LIST_2)
        val TESTE_DESINER_E_UX = Project(2, "Teste usabilidade", "BlaBlaBlaBlaBla BlaBlaBlaBlaBlaBlaBlaBlaBlaBla BlaBlaBlaBlaBla", KNOWLEDGE_LIST.LIST_2, USER_LIST.LIST_1)
        val CONHECIMENTOS_BASICOS = Project(3, "Base", "BlaBlaBlaBlaBla BlaBlaBlaBlaBlaBlaBlaBlaBlaBla BlaBlaBlaBlaBla", KNOWLEDGE_LIST.LIST_1, USER_LIST.LIST_3)
        val CONHECIMENTOS_FRONTEND = Project(4, "Frontend", "BlaBlaBlaBlaBla BlaBlaBlaBlaBlaBlaBlaBlaBlaBla BlaBlaBlaBlaBla", KNOWLEDGE_LIST.LIST_1, USER_LIST.LIST_3)
        val ALL =  listOf<Project>(APLICATIVO_ANDROID,TESTE_DESINER_E_UX,CONHECIMENTOS_BASICOS,CONHECIMENTOS_FRONTEND)
    }

    object PROJECT_LIST {
        val PROJETOS_AUTOGLASS = listOf<Project>(PROJECT.APLICATIVO_ANDROID, PROJECT.TESTE_DESINER_E_UX)
        val PROJETOS_INFLOR = listOf<Project>(PROJECT.CONHECIMENTOS_BASICOS, PROJECT.TESTE_DESINER_E_UX)
    }

    object CAREER {
        val DEV_ANDROID = Career(1, "Desenvolvedor Android", "Nesta carreira aprenda desenvolver aplicações android nativamente usando os recursos da API do sistema Google", KNOWLEDGE_LIST.LIST_3 )
        val DESENVOLVEDOR_ANDROID  = Career(2, "Desenvolvedor android","Nesta carreira aprenda desenvolver aplicações android",KNOWLEDGE_LIST.LIST_1 )
        val DESENVOLVEDOR_APPLE_MOBILE_IOS  = Career(3, "Desenvolvedor apple mobile ios","Nesta carreira aprenda desenvolver aplicações ios",KNOWLEDGE_LIST.LIST_1 )
        val DESENVOLVIMENTO_MOBILE_COM_KOTLIN  = Career(4, "Desenvolvimento mobile com kotlin","Nesta carreira aprenda desenvolver aplicações kotlin",KNOWLEDGE_LIST.LIST_1 )
        val DESENVOLVEDOR_MOBILE_MULTIPLATAFORMA_CORDOVA  = Career(5, "Desenvolvedor mobile multiplataforma_cordova","Nesta carreira aprenda desenvolver aplicações multiplataforma_cordova",KNOWLEDGE_LIST.LIST_1 )
        val DESENVOLVEDOR_MOBILE_MULTIPLATAFORMA_XAMARIN  = Career(6, "Desenvolvedor mobile multiplataforma xamarin","Nesta carreira aprenda desenvolver aplicações xamarin",KNOWLEDGE_LIST.LIST_1 )
        val PROGRAMADOR_IONIC  = Career(7, "Programador ionic","Nesta carreira aprenda desenvolver aplicações ionic",KNOWLEDGE_LIST.LIST_1 )
        val DESENVOLVEDOR_JAVASCRIPT  = Career(8, "Desenvolvedor javascript","Nesta carreira aprenda desenvolver aplicações javascript",KNOWLEDGE_LIST.LIST_1 )
        val ENGENHEIRO_JAVASCRIPT  = Career(9, "Engenheiro javascript","Nesta carreira aprenda desenvolver aplicações como Engenheiro javascript",KNOWLEDGE_LIST.LIST_1 )
        val DESENVOLVEDOR_FRONT_END  = Career(10, "Desenvolvedor front","Nesta carreira aprenda desenvolver aplicações front",KNOWLEDGE_LIST.LIST_1 )
        val ENGENHEIRO_FRONT_END  = Career(11, "Engenheiro front","Nesta carreira aprenda desenvolver aplicações como Engenheiro front",KNOWLEDGE_LIST.LIST_1 )
        val PROGRAMADOR_ANGULAR = Career(12, "Programador angular","Nesta carreira aprenda desenvolver aplicações angular",KNOWLEDGE_LIST.LIST_1 )
        val AGILISTA  = Career(13, "Agilista","Nesta carreira aprenda desenvolver aplicações Agilista",KNOWLEDGE_LIST.LIST_1 )
        val SOCIAL_MEDIA_MARKETING  = Career(14, "Social media marketing","Nesta carreira aprenda desenvolver aplicações Social media",KNOWLEDGE_LIST.LIST_1 )
        val SOFT_SKILLS  = Career(15, "Soft skills","Nesta carreira aprenda desenvolver aplicações ",KNOWLEDGE_LIST.LIST_1 )
        val MARKETING_DIGITAL  = Career(16, "Marketing digital","Nesta carreira aprenda desenvolver aplicações Marketing digital",KNOWLEDGE_LIST.LIST_1 )
        val SEO_EXPERT  = Career(17, "Seo expert", "Nesta carreira aprenda desenvolver aplicações como Seo expert", KNOWLEDGE_LIST.LIST_1 )
        val CERTIFICAÇÃO_ITIL_FOUNDATION  = Career(18, "Certificação itil foundation","Nesta carreira aprenda desenvolver aplicações itil",KNOWLEDGE_LIST.LIST_1 )
        val GERENCIAMENTO_DE_PROJETOS_COM_SCRUM  = Career(19, "Gerenciamento de projetos com scrum","Nesta carreira aprenda desenvolver aplicações scrum",KNOWLEDGE_LIST.LIST_1 )
        val DESIGN_DE_APRESENTAcAO  = Career(20, "Design de apresentação","Nesta carreira aprenda desenvolver aplicações Design",KNOWLEDGE_LIST.LIST_2 )
        val ALL =  listOf<Career>(DEV_ANDROID,DESENVOLVEDOR_ANDROID,DESENVOLVEDOR_APPLE_MOBILE_IOS,DESENVOLVIMENTO_MOBILE_COM_KOTLIN,DESENVOLVEDOR_MOBILE_MULTIPLATAFORMA_CORDOVA,DESENVOLVEDOR_MOBILE_MULTIPLATAFORMA_XAMARIN,PROGRAMADOR_IONIC,DESENVOLVEDOR_JAVASCRIPT,ENGENHEIRO_JAVASCRIPT,DESENVOLVEDOR_FRONT_END,ENGENHEIRO_FRONT_END,PROGRAMADOR_ANGULAR,AGILISTA,SOCIAL_MEDIA_MARKETING,SOFT_SKILLS,MARKETING_DIGITAL,SEO_EXPERT,CERTIFICAÇÃO_ITIL_FOUNDATION,GERENCIAMENTO_DE_PROJETOS_COM_SCRUM, DESIGN_DE_APRESENTAcAO)
    }

    object CAREER_LIST {
        val CARREIRAS_AUTOGLASS = listOf<Career>(CAREER.DEV_ANDROID)
        val CARREIRAS_INFLOR = listOf<Career>(CAREER.DESENVOLVEDOR_JAVASCRIPT, CAREER.DEV_ANDROID)
        val CARREIRAS_QUALITY = listOf<Career>(CAREER.PROGRAMADOR_IONIC , CAREER.DESENVOLVEDOR_MOBILE_MULTIPLATAFORMA_CORDOVA)
        val CARREIRAS_FAESA = listOf<Career>(CAREER.CERTIFICAÇÃO_ITIL_FOUNDATION , CAREER.DESENVOLVEDOR_MOBILE_MULTIPLATAFORMA_CORDOVA)
        val CARREIRAS_VIXTEAM = listOf<Career>(CAREER.SEO_EXPERT , CAREER.PROGRAMADOR_IONIC)
        val CARREIRAS_PICPAY = listOf<Career>(CAREER.CERTIFICAÇÃO_ITIL_FOUNDATION , CAREER.DESIGN_DE_APRESENTAcAO)

    }

    object COMPANY {
        val AUTOGLASS = Company(1, "Autoglass", "Um lugar de pessoas que amam o que fazem.", CAREER_LIST.CARREIRAS_AUTOGLASS, PROJECT_LIST.PROJETOS_AUTOGLASS)
        val INFLOR = Company(2, "Inflor", "É líder no mercado de sistemas para a gestão florestal. Este é nosso Slogan. Somos apaixonados pelo que fazemos!", CAREER_LIST.CARREIRAS_INFLOR, PROJECT_LIST.PROJETOS_INFLOR)
        val QUALITY = Company(3, "QUALITY", "Descricao", CAREER_LIST.CARREIRAS_QUALITY, PROJECT_LIST.PROJETOS_AUTOGLASS)
        val FAESA = Company(4,"FAESA", "Descricao", CAREER_LIST.CARREIRAS_FAESA, PROJECT_LIST.PROJETOS_AUTOGLASS)
        val VIXTEAM = Company(5, "VIXTEAM", "Descricao", CAREER_LIST.CARREIRAS_VIXTEAM, PROJECT_LIST.PROJETOS_AUTOGLASS)
        val PICPAY = Company(6, "PICPAY", "Descricao", CAREER_LIST.CARREIRAS_PICPAY, PROJECT_LIST.PROJETOS_AUTOGLASS)

        val ALL =  listOf<Company>(AUTOGLASS,INFLOR, QUALITY, FAESA, VIXTEAM, PICPAY)

    }
}