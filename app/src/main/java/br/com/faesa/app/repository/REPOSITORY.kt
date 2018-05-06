package br.com.faesa.app.repository

import br.com.faesa.app.domain.*

/**
 * Created by wiliam on 5/6/18.
 */
object REPOSITORY {

    object KNOWLEDGE {
        val SCRUM = Knowledge(1 ,"Scrum")
        val GIT = Knowledge(6 ,"Git")
        val GITHUB = Knowledge(10 ,"Github")
        val TRELLO = Knowledge(14 ,"Trello")
        val MVC = Knowledge(23 ,"MVC")
        val MVP = Knowledge(24 ,"MVP")
        val TDD = Knowledge(33 ,"TDD")
        val PROGRAMACAOEMPAR = Knowledge(34 ,"Programação em Par")


        val AGILE = Knowledge(13 ,"Agile")
        val SVN = Knowledge(7 ,"svn")
        val GITLAB = Knowledge(11 ,"Gitlab")
        val JYRA = Knowledge(15 ,"Jyra")
        val SOURCETREE = Knowledge(9 ,"Sourcetree")
        val DELPHI = Knowledge(22 ,"Delphi")
        val MVVM = Knowledge(25 ,"MVVM")
        val DDD = Knowledge(26 ,"DDD")

        val ILUSTRATOR = Knowledge(27 ,"Ilustrator")
        val PHOTOSHOP = Knowledge(28 ,"Photoshop")
        val ZEPLIN = Knowledge(31 ,"Zeplin")
        val SKETCHUP = Knowledge(29 ,"Sketchup")
        val USABILIDADE = Knowledge(30 ,"Usabilidade")
        val NINJAMOCK = Knowledge(32 ,"Ninjamock")

        val JAVA = Knowledge(18 ,"Java")
        val JAVASCRIPT = Knowledge(20 ,"Javascript")
        val ANGULARJS = Knowledge(21 ,"Angularjs")

        val CVS = Knowledge(8 ,"CVS")
        val BITBUCKET = Knowledge(12 ,"Bitbucket")

        val FEATUREDRIVENDEVELOPMENT = Knowledge(2, "Feature Driven Development (FDD)")
        val EXTREMEPROGRAMMING = Knowledge(3, "eXtreme Programming (XP)")
        val MICROSOFTSOLUTIONSFRAMEWORK = Knowledge(4, "Microsoft Solutions Framework (MSF)")
        val DYNAMICSYSTEMDEVELOPMENTMODEL = Knowledge(5, "Dynamic System Development Model (DSDM)")
        val PIPEFY = Knowledge(16 ,"Pipefy")
        val REDMINE = Knowledge(17 ,"Redmine")
        val CSHARP = Knowledge(19 ,"C#")
        val TESTEUNITARIO = Knowledge(35 ,"Teste Unitario")
        val TESTEDEINTEGRACAO = Knowledge(36 ,"Teste de integração")

        val ALL = listOf(SCRUM,FEATUREDRIVENDEVELOPMENT,EXTREMEPROGRAMMING,MICROSOFTSOLUTIONSFRAMEWORK,DYNAMICSYSTEMDEVELOPMENTMODEL,GIT,SVN,CVS,SOURCETREE,GITHUB,GITLAB,BITBUCKET,AGILE,TRELLO,JYRA,PIPEFY,REDMINE,JAVA,CSHARP,JAVASCRIPT,ANGULARJS,DELPHI,MVC,MVP,MVVM,DDD,ILUSTRATOR,PHOTOSHOP,SKETCHUP,USABILIDADE,ZEPLIN,NINJAMOCK,TDD,PROGRAMACAOEMPAR,TESTEUNITARIO,TESTEDEINTEGRACAO)
    }

    object KNOWLEDGE_LIST {
        val PROGRAMDOR_JR = listOf<Knowledge>(KNOWLEDGE.SCRUM, KNOWLEDGE.GIT, KNOWLEDGE.GITHUB, KNOWLEDGE.TRELLO, KNOWLEDGE.JAVA)
        val ANALISTA = listOf<Knowledge>(KNOWLEDGE.SCRUM, KNOWLEDGE.TDD, KNOWLEDGE.AGILE, KNOWLEDGE.PROGRAMACAOEMPAR, KNOWLEDGE.JAVA)
        val DESIGNER = listOf<Knowledge>(KNOWLEDGE.USABILIDADE, KNOWLEDGE.PHOTOSHOP, KNOWLEDGE.NINJAMOCK, KNOWLEDGE.ZEPLIN, KNOWLEDGE.SKETCHUP)
        val DEV_WEB = listOf<Knowledge>(KNOWLEDGE.AGILE, KNOWLEDGE.TRELLO, KNOWLEDGE.JAVASCRIPT, KNOWLEDGE.BITBUCKET, KNOWLEDGE.ANGULARJS)
        val GERENTE_PROJETOS = listOf(KNOWLEDGE.SCRUM, KNOWLEDGE.TRELLO, KNOWLEDGE.AGILE, KNOWLEDGE.JYRA, KNOWLEDGE.ZEPLIN, KNOWLEDGE.NINJAMOCK, KNOWLEDGE.REDMINE)
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
    }

    object PROJECT {
        val APLICATIVO_ANDROID = Project(1, "Aplicativo android", "Aplicação nativa", KNOWLEDGE_LIST.PROGRAMDOR_JR, USER_LIST.LIST_2)
        val TESTE_DESINER_E_UX = Project(2, "Teste usabilidade", "BlaBlaBlaBlaBla BlaBlaBlaBlaBlaBlaBlaBlaBlaBla BlaBlaBlaBlaBla", KNOWLEDGE_LIST.ANALISTA, USER_LIST.LIST_1)
        val CONHECIMENTOS_BASICOS = Project(3, "Base", "BlaBlaBlaBlaBla BlaBlaBlaBlaBlaBlaBlaBlaBlaBla BlaBlaBlaBlaBla", KNOWLEDGE_LIST.PROGRAMDOR_JR, USER_LIST.LIST_3)
        val CONHECIMENTOS_FRONTEND = Project(4, "Frontend", "BlaBlaBlaBlaBla BlaBlaBlaBlaBlaBlaBlaBlaBlaBla BlaBlaBlaBlaBla", KNOWLEDGE_LIST.PROGRAMDOR_JR, USER_LIST.LIST_3)
        val ALL = listOf<Project>(APLICATIVO_ANDROID,TESTE_DESINER_E_UX,CONHECIMENTOS_BASICOS,CONHECIMENTOS_FRONTEND)
    }

    object PROJECT_LIST {
        val PROJETOS_AUTOGLASS = listOf<Project>(PROJECT.APLICATIVO_ANDROID, PROJECT.TESTE_DESINER_E_UX)
        val PROJETOS_INFLOR = listOf<Project>(PROJECT.CONHECIMENTOS_BASICOS, PROJECT.TESTE_DESINER_E_UX)
        val PROJETOS_QUALITY = listOf<Project>(PROJECT.APLICATIVO_ANDROID, PROJECT.CONHECIMENTOS_FRONTEND)
        val PROJETOS_FAESA = listOf<Project>(PROJECT.CONHECIMENTOS_BASICOS, PROJECT.CONHECIMENTOS_FRONTEND)
        val PROJETOS_VIXTEAM = listOf<Project>(PROJECT.CONHECIMENTOS_FRONTEND, PROJECT.CONHECIMENTOS_BASICOS)
        val PROJETOS_PICPAY = listOf<Project>(PROJECT.TESTE_DESINER_E_UX, PROJECT.CONHECIMENTOS_FRONTEND)
    }

    object CAREER {
        val DEV_ANDROID = Career(1, "Desenvolvedor Android", "Nesta carreira aprenda desenvolver aplicações android nativamente usando os recursos da API do sistema Google", KNOWLEDGE_LIST.PROGRAMDOR_JR)
        val DESENVOLVEDOR_WEB  = Career(21, "Desenvolvedor web","Nesta carreira aprenda desenvolver aplicações ios",KNOWLEDGE_LIST.DEV_WEB)
        val DESIGNER = Career(3, "Designer","Nesta carreira aprenda desenvolver aplicações ios",KNOWLEDGE_LIST.DESIGNER)
        val DESENVOLVIMENTO_MOBILE_COM_KOTLIN  = Career(4, "Desenvolvimento mobile com kotlin","Nesta carreira aprenda desenvolver aplicações kotlin",KNOWLEDGE_LIST.PROGRAMDOR_JR)
        val DESENVOLVEDOR_MOBILE_MULTIPLATAFORMA_CORDOVA  = Career(5, "Desenvolvedor mobile multiplataforma_cordova","Nesta carreira aprenda desenvolver aplicações multiplataforma_cordova",KNOWLEDGE_LIST.ANALISTA )
        val DESENVOLVEDOR_MOBILE_MULTIPLATAFORMA_XAMARIN  = Career(6, "Desenvolvedor mobile multiplataforma xamarin","Nesta carreira aprenda desenvolver aplicações xamarin",KNOWLEDGE_LIST.DESIGNER)
        val PROGRAMADOR_IONIC  = Career(7, "Programador ionic","Nesta carreira aprenda desenvolver aplicações ionic",KNOWLEDGE_LIST.DEV_WEB)
        val DESENVOLVEDOR_JAVASCRIPT  = Career(8, "Desenvolvedor javascript","Nesta carreira aprenda desenvolver aplicações javascript",KNOWLEDGE_LIST.DEV_WEB )
        val ENGENHEIRO_JAVASCRIPT  = Career(9, "Engenheiro javascript","Nesta carreira aprenda desenvolver aplicações como Engenheiro javascript",KNOWLEDGE_LIST.DEV_WEB )
        val DESENVOLVEDOR_FRONT_END  = Career(10, "Desenvolvedor front","Nesta carreira aprenda desenvolver aplicações front",KNOWLEDGE_LIST.DEV_WEB )
        val ENGENHEIRO_FRONT_END  = Career(11, "Engenheiro front","Nesta carreira aprenda desenvolver aplicações como Engenheiro front",KNOWLEDGE_LIST.ANALISTA )
        val PROGRAMADOR_ANGULAR = Career(12, "Programador angular","Nesta carreira aprenda desenvolver aplicações angular",KNOWLEDGE_LIST.DEV_WEB)
        val AGILISTA  = Career(13, "Agilista","Nesta carreira aprenda desenvolver aplicações Agilista",KNOWLEDGE_LIST.GERENTE_PROJETOS)
        val SOCIAL_MEDIA_MARKETING  = Career(14, "Social media marketing","Nesta carreira aprenda desenvolver aplicações Social media",KNOWLEDGE_LIST.GERENTE_PROJETOS)
        val SOFT_SKILLS  = Career(15, "Soft skills","Nesta carreira aprenda desenvolver aplicações ",KNOWLEDGE_LIST.DESIGNER )
        val MARKETING_DIGITAL  = Career(16, "Marketing digital","Nesta carreira aprenda desenvolver aplicações Marketing digital",KNOWLEDGE_LIST.DEV_WEB )
        val SEO_EXPERT  = Career(17, "Seo expert", "Nesta carreira aprenda desenvolver aplicações como Seo expert", KNOWLEDGE_LIST.DEV_WEB )
        val CERTIFICAÇÃO_ITIL_FOUNDATION  = Career(18, "Certificação itil foundation","Nesta carreira aprenda desenvolver aplicações itil",KNOWLEDGE_LIST.DEV_WEB )
        val GERENCIAMENTO_DE_PROJETOS_COM_SCRUM  = Career(19, "Gerenciamento de projetos com scrum","Nesta carreira aprenda desenvolver aplicações scrum",KNOWLEDGE_LIST.DEV_WEB)
        val DESIGN_DE_APRESENTAcAO  = Career(20, "Design de apresentação","Nesta carreira aprenda desenvolver aplicações Design",KNOWLEDGE_LIST.DESIGNER)
        val ALL =  listOf<Career>(DEV_ANDROID, DESENVOLVEDOR_WEB, DESIGNER,DESENVOLVIMENTO_MOBILE_COM_KOTLIN,DESENVOLVEDOR_MOBILE_MULTIPLATAFORMA_CORDOVA,DESENVOLVEDOR_MOBILE_MULTIPLATAFORMA_XAMARIN,PROGRAMADOR_IONIC,DESENVOLVEDOR_JAVASCRIPT,ENGENHEIRO_JAVASCRIPT,DESENVOLVEDOR_FRONT_END,ENGENHEIRO_FRONT_END,PROGRAMADOR_ANGULAR,AGILISTA,SOCIAL_MEDIA_MARKETING,SOFT_SKILLS,MARKETING_DIGITAL,SEO_EXPERT,CERTIFICAÇÃO_ITIL_FOUNDATION,GERENCIAMENTO_DE_PROJETOS_COM_SCRUM, DESIGN_DE_APRESENTAcAO)
    }

    object CAREER_LIST {
        val CARREIRAS_AUTOGLASS = listOf<Career>(CAREER.DESENVOLVEDOR_WEB, CAREER.DESIGNER, CAREER.DEV_ANDROID, CAREER.AGILISTA, CAREER.ENGENHEIRO_FRONT_END)
        val CARREIRAS_INFLOR = listOf<Career>(CAREER.DEV_ANDROID, CAREER.PROGRAMADOR_IONIC,  CAREER.AGILISTA, CAREER.ENGENHEIRO_JAVASCRIPT)
        val CARREIRAS_QUALITY = listOf<Career>(CAREER.PROGRAMADOR_IONIC , CAREER.DESENVOLVEDOR_MOBILE_MULTIPLATAFORMA_CORDOVA)
        val CARREIRAS_FAESA = listOf<Career>(CAREER.DESENVOLVEDOR_WEB, CAREER.DESIGNER, CAREER.DEV_ANDROID, CAREER.AGILISTA, CAREER.ENGENHEIRO_FRONT_END)
        val CARREIRAS_VIXTEAM = listOf<Career>(CAREER.DESENVOLVEDOR_WEB, CAREER.DESIGNER, CAREER.DEV_ANDROID, CAREER.AGILISTA, CAREER.ENGENHEIRO_FRONT_END)
        val CARREIRAS_PICPAY = listOf<Career>(CAREER.DESENVOLVEDOR_WEB, CAREER.DESIGNER, CAREER.DEV_ANDROID, CAREER.AGILISTA, CAREER.ENGENHEIRO_FRONT_END)

    }

    object COMPANY {
        val AUTOGLASS = Company(1, "Autoglass", "Um lugar de pessoas que amam o que fazem.", CAREER_LIST.CARREIRAS_AUTOGLASS, PROJECT_LIST.PROJETOS_AUTOGLASS)
        val INFLOR = Company(2, "Inflor", "Líder no mercado de sistemas para a gestão florestal", CAREER_LIST.CARREIRAS_INFLOR, PROJECT_LIST.PROJETOS_INFLOR)
        val QUALITY = Company(3, "Quality Automação", "Soluções inteligentes para sua empresa, Inovação, Tecnologia e Segurança para seu posto de combustível", CAREER_LIST.CARREIRAS_QUALITY, PROJECT_LIST.PROJETOS_QUALITY)
        val FAESA = Company(4,"FAESA", "Para a FAESA, conhecimento faz toda a diferença", CAREER_LIST.CARREIRAS_FAESA, PROJECT_LIST.PROJETOS_FAESA)
        val VIXTEAM = Company(5, "VixTeam", "Fornecemos serviços de Fábrica de Software e soluções GRC", CAREER_LIST.CARREIRAS_VIXTEAM, PROJECT_LIST.PROJETOS_VIXTEAM)
        val PICPAY = Company(6, "PicPay", "Tudo o que você faz é parte de sua história. Até os pagamentos.", CAREER_LIST.CARREIRAS_PICPAY, PROJECT_LIST.PROJETOS_PICPAY)

        val ALL =  listOf<Company>(AUTOGLASS,INFLOR,QUALITY,FAESA,VIXTEAM,PICPAY)

    }
}