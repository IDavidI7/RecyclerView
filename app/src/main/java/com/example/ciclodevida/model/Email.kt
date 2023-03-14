package com.example.ciclodevida.model

data class Email(
    val user: String,
    val subject: String,
    val preview: String,
    val date: String,
    val stared: Boolean,
    val unread: Boolean,
    val selected: Boolean = false
)

class emailBuilder {
    var user: String = ""
    var subject: String = ""
    var preview: String = ""
    var date: String = ""
    var stared: Boolean = false
    var unread: Boolean = false

    fun build(): Email = Email(user, subject, preview, date, stared, unread, false)
}

fun email(block: emailBuilder.() -> Unit): Email = emailBuilder().apply(block).build()

fun fakeEmail(): MutableList<Email> = mutableListOf(
    email {
        user = "Davidwilliandd@outlook.com"
        subject =
            "Me Contrate! Prometo que farei o possível para fazer todas as tarefas com êxito, mas na sua empresa eu serei com certeza!!!"
        preview = "Você reconhece este Email?"
        date = "09 mar"
        stared = false
    },
    email {
        user = "LinkedIn.com"
        subject = "Seu emprego dos sonhos se encontra aqui! Não esqueça da sua vitória!"
        preview = "Olá David Willian, Você esta preparado para engressar na sua nova carreira??"
        date = "09 mar"
        stared = false
    },
    email {
        user = "EquipeOutlook.com"
        subject =
            "Sua faculdade dos sonhos esta na PUC Paraná! Venha realizar seus sonhos com a gente!!"
        preview = "Olá David Willian, Você gosta desse site?"
        date = "09 mar"
        stared = false
        unread = true
    },
    email {
        user = "Davidwilliandd@outlook.com"
        subject =
            "Me Contrate! Prometo que farei o possível para fazer todas as tarefas com êxito, mas na sua empresa eu serei com certeza!!!"
        preview = "Você reconhece este Email?"
        date = "09 mar"
        stared = true
        unread = true
    },email {
        user = "Davidwilliandd@outlook.com"
        subject =
            "Me Contrate! Prometo que farei o possível para fazer todas as tarefas com êxito, mas na sua empresa eu serei com certeza!!!"
        preview = "Você reconhece este Email?"
        date = "09 mar"
        stared = false
    },
    email {
        user = "LinkedIn.com"
        subject = "Seu emprego dos sonhos se encontra aqui! Não esqueça da sua vitória!"
        preview = "Olá David Willian, Você esta preparado para engressar na sua nova carreira??"
        date = "09 mar"
        stared = false
    },
    email {
        user = "EquipeOutlook.com"
        subject =
            "Sua faculdade dos sonhos esta na PUC Paraná! Venha realizar seus sonhos com a gente!!"
        preview = "Olá David Willian, Você gosta desse site?"
        date = "09 mar"
        stared = false
        unread = true
    },
    email {
        user = "Davidwilliandd@outlook.com"
        subject =
            "Me Contrate! Prometo que farei o possível para fazer todas as tarefas com êxito, mas na sua empresa eu serei com certeza!!!"
        preview = "Você reconhece este Email?"
        date = "09 mar"
        stared = true
        unread = true
    },email {
        user = "Davidwilliandd@outlook.com"
        subject =
            "Me Contrate! Prometo que farei o possível para fazer todas as tarefas com êxito, mas na sua empresa eu serei com certeza!!!"
        preview = "Você reconhece este Email?"
        date = "09 mar"
        stared = false
    },
    email {
        user = "LinkedIn.com"
        subject = "Seu emprego dos sonhos se encontra aqui! Não esqueça da sua vitória!"
        preview = "Olá David Willian, Você esta preparado para engressar na sua nova carreira??"
        date = "09 mar"
        stared = false
    },
    email {
        user = "EquipeOutlook.com"
        subject =
            "Sua faculdade dos sonhos esta na PUC Paraná! Venha realizar seus sonhos com a gente!!"
        preview = "Olá David Willian, Você gosta desse site?"
        date = "09 mar"
        stared = false
        unread = true
    },
    email {
        user = "Davidwilliandd@outlook.com"
        subject =
            "Me Contrate! Prometo que farei o possível para fazer todas as tarefas com êxito, mas na sua empresa eu serei com certeza!!!"
        preview = "Você reconhece este Email?"
        date = "09 mar"
        stared = true
        unread = true
    },email {
        user = "Davidwilliandd@outlook.com"
        subject =
            "Me Contrate! Prometo que farei o possível para fazer todas as tarefas com êxito, mas na sua empresa eu serei com certeza!!!"
        preview = "Você reconhece este Email?"
        date = "09 mar"
        stared = false
    },
    email {
        user = "LinkedIn.com"
        subject = "Seu emprego dos sonhos se encontra aqui! Não esqueça da sua vitória!"
        preview = "Olá David Willian, Você esta preparado para engressar na sua nova carreira??"
        date = "09 mar"
        stared = false
    },
    email {
        user = "EquipeOutlook.com"
        subject =
            "Sua faculdade dos sonhos esta na PUC Paraná! Venha realizar seus sonhos com a gente!!"
        preview = "Olá David Willian, Você gosta desse site?"
        date = "09 mar"
        stared = false
        unread = true
    },
    email {
        user = "Davidwilliandd@outlook.com"
        subject =
            "Me Contrate! Prometo que farei o possível para fazer todas as tarefas com êxito, mas na sua empresa eu serei com certeza!!!"
        preview = "Você reconhece este Email?"
        date = "09 mar"
        stared = true
        unread = true
    },email {
        user = "Davidwilliandd@outlook.com"
        subject =
            "Me Contrate! Prometo que farei o possível para fazer todas as tarefas com êxito, mas na sua empresa eu serei com certeza!!!"
        preview = "Você reconhece este Email?"
        date = "09 mar"
        stared = false
    },
    email {
        user = "LinkedIn.com"
        subject = "Seu emprego dos sonhos se encontra aqui! Não esqueça da sua vitória!"
        preview = "Olá David Willian, Você esta preparado para engressar na sua nova carreira??"
        date = "09 mar"
        stared = false
    },
    email {
        user = "EquipeOutlook.com"
        subject =
            "Sua faculdade dos sonhos esta na PUC Paraná! Venha realizar seus sonhos com a gente!!"
        preview = "Olá David Willian, Você gosta desse site?"
        date = "09 mar"
        stared = false
        unread = true
    },
    email {
        user = "Davidwilliandd@outlook.com"
        subject =
            "Me Contrate! Prometo que farei o possível para fazer todas as tarefas com êxito, mas na sua empresa eu serei com certeza!!!"
        preview = "Você reconhece este Email?"
        date = "09 mar"
        stared = true
        unread = true
    },email {
        user = "Davidwilliandd@outlook.com"
        subject =
            "Me Contrate! Prometo que farei o possível para fazer todas as tarefas com êxito, mas na sua empresa eu serei com certeza!!!"
        preview = "Você reconhece este Email?"
        date = "09 mar"
        stared = false
    },
    email {
        user = "LinkedIn.com"
        subject = "Seu emprego dos sonhos se encontra aqui! Não esqueça da sua vitória!"
        preview = "Olá David Willian, Você esta preparado para engressar na sua nova carreira??"
        date = "09 mar"
        stared = false
    },
    email {
        user = "EquipeOutlook.com"
        subject =
            "Sua faculdade dos sonhos esta na PUC Paraná! Venha realizar seus sonhos com a gente!!"
        preview = "Olá David Willian, Você gosta desse site?"
        date = "09 mar"
        stared = false
        unread = true
    },
    email {
        user = "Davidwilliandd@outlook.com"
        subject =
            "Me Contrate! Prometo que farei o possível para fazer todas as tarefas com êxito, mas na sua empresa eu serei com certeza!!!"
        preview = "Você reconhece este Email?"
        date = "09 mar"
        stared = true
        unread = true
    },email {
        user = "Davidwilliandd@outlook.com"
        subject =
            "Me Contrate! Prometo que farei o possível para fazer todas as tarefas com êxito, mas na sua empresa eu serei com certeza!!!"
        preview = "Você reconhece este Email?"
        date = "09 mar"
        stared = false
    },
    email {
        user = "LinkedIn.com"
        subject = "Seu emprego dos sonhos se encontra aqui! Não esqueça da sua vitória!"
        preview = "Olá David Willian, Você esta preparado para engressar na sua nova carreira??"
        date = "09 mar"
        stared = false
    },
    email {
        user = "EquipeOutlook.com"
        subject =
            "Sua faculdade dos sonhos esta na PUC Paraná! Venha realizar seus sonhos com a gente!!"
        preview = "Olá David Willian, Você gosta desse site?"
        date = "09 mar"
        stared = false
        unread = true
    },
    email {
        user = "Davidwilliandd@outlook.com"
        subject =
            "Me Contrate! Prometo que farei o possível para fazer todas as tarefas com êxito, mas na sua empresa eu serei com certeza!!!"
        preview = "Você reconhece este Email?"
        date = "09 mar"
        stared = true
        unread = true
    },email {
        user = "Davidwilliandd@outlook.com"
        subject =
            "Me Contrate! Prometo que farei o possível para fazer todas as tarefas com êxito, mas na sua empresa eu serei com certeza!!!"
        preview = "Você reconhece este Email?"
        date = "09 mar"
        stared = false
    },
    email {
        user = "LinkedIn.com"
        subject = "Seu emprego dos sonhos se encontra aqui! Não esqueça da sua vitória!"
        preview = "Olá David Willian, Você esta preparado para engressar na sua nova carreira??"
        date = "09 mar"
        stared = false
    },
    email {
        user = "EquipeOutlook.com"
        subject =
            "Sua faculdade dos sonhos esta na PUC Paraná! Venha realizar seus sonhos com a gente!!"
        preview = "Olá David Willian, Você gosta desse site?"
        date = "09 mar"
        stared = false
        unread = true
    },
    email {
        user = "Davidwilliandd@outlook.com"
        subject =
            "Me Contrate! Prometo que farei o possível para fazer todas as tarefas com êxito, mas na sua empresa eu serei com certeza!!!"
        preview = "Você reconhece este Email?"
        date = "09 mar"
        stared = true
        unread = true
    },email {
        user = "Davidwilliandd@outlook.com"
        subject =
            "Me Contrate! Prometo que farei o possível para fazer todas as tarefas com êxito, mas na sua empresa eu serei com certeza!!!"
        preview = "Você reconhece este Email?"
        date = "09 mar"
        stared = false
    },
    email {
        user = "LinkedIn.com"
        subject = "Seu emprego dos sonhos se encontra aqui! Não esqueça da sua vitória!"
        preview = "Olá David Willian, Você esta preparado para engressar na sua nova carreira??"
        date = "09 mar"
        stared = false
    },
    email {
        user = "EquipeOutlook.com"
        subject =
            "Sua faculdade dos sonhos esta na PUC Paraná! Venha realizar seus sonhos com a gente!!"
        preview = "Olá David Willian, Você gosta desse site?"
        date = "09 mar"
        stared = false
        unread = true
    },
    email {
        user = "Davidwilliandd@outlook.com"
        subject =
            "Me Contrate! Prometo que farei o possível para fazer todas as tarefas com êxito, mas na sua empresa eu serei com certeza!!!"
        preview = "Você reconhece este Email?"
        date = "09 mar"
        stared = true
        unread = true
    },email {
        user = "Davidwilliandd@outlook.com"
        subject =
            "Me Contrate! Prometo que farei o possível para fazer todas as tarefas com êxito, mas na sua empresa eu serei com certeza!!!"
        preview = "Você reconhece este Email?"
        date = "09 mar"
        stared = false
    },
    email {
        user = "LinkedIn.com"
        subject = "Seu emprego dos sonhos se encontra aqui! Não esqueça da sua vitória!"
        preview = "Olá David Willian, Você esta preparado para engressar na sua nova carreira??"
        date = "09 mar"
        stared = false
    },
    email {
        user = "EquipeOutlook.com"
        subject =
            "Sua faculdade dos sonhos esta na PUC Paraná! Venha realizar seus sonhos com a gente!!"
        preview = "Olá David Willian, Você gosta desse site?"
        date = "09 mar"
        stared = false
        unread = true
    },
    email {
        user = "Davidwilliandd@outlook.com"
        subject =
            "Me Contrate! Prometo que farei o possível para fazer todas as tarefas com êxito, mas na sua empresa eu serei com certeza!!!"
        preview = "Você reconhece este Email?"
        date = "09 mar"
        stared = true
        unread = true
    },email {
        user = "Davidwilliandd@outlook.com"
        subject =
            "Me Contrate! Prometo que farei o possível para fazer todas as tarefas com êxito, mas na sua empresa eu serei com certeza!!!"
        preview = "Você reconhece este Email?"
        date = "09 mar"
        stared = false
    },
    email {
        user = "LinkedIn.com"
        subject = "Seu emprego dos sonhos se encontra aqui! Não esqueça da sua vitória!"
        preview = "Olá David Willian, Você esta preparado para engressar na sua nova carreira??"
        date = "09 mar"
        stared = false
    },
    email {
        user = "EquipeOutlook.com"
        subject =
            "Sua faculdade dos sonhos esta na PUC Paraná! Venha realizar seus sonhos com a gente!!"
        preview = "Olá David Willian, Você gosta desse site?"
        date = "09 mar"
        stared = false
        unread = true
    },
    email {
        user = "Davidwilliandd@outlook.com"
        subject =
            "Me Contrate! Prometo que farei o possível para fazer todas as tarefas com êxito, mas na sua empresa eu serei com certeza!!!"
        preview = "Você reconhece este Email?"
        date = "09 mar"
        stared = true
        unread = true
    },email {
        user = "Davidwilliandd@outlook.com"
        subject =
            "Me Contrate! Prometo que farei o possível para fazer todas as tarefas com êxito, mas na sua empresa eu serei com certeza!!!"
        preview = "Você reconhece este Email?"
        date = "09 mar"
        stared = false
    },
    email {
        user = "LinkedIn.com"
        subject = "Seu emprego dos sonhos se encontra aqui! Não esqueça da sua vitória!"
        preview = "Olá David Willian, Você esta preparado para engressar na sua nova carreira??"
        date = "09 mar"
        stared = false
    },
    email {
        user = "EquipeOutlook.com"
        subject =
            "Sua faculdade dos sonhos esta na PUC Paraná! Venha realizar seus sonhos com a gente!!"
        preview = "Olá David Willian, Você gosta desse site?"
        date = "09 mar"
        stared = false
        unread = true
    },
    email {
        user = "Davidwilliandd@outlook.com"
        subject =
            "Me Contrate! Prometo que farei o possível para fazer todas as tarefas com êxito, mas na sua empresa eu serei com certeza!!!"
        preview = "Você reconhece este Email?"
        date = "09 mar"
        stared = true
        unread = true
    },email {
        user = "Davidwilliandd@outlook.com"
        subject =
            "Me Contrate! Prometo que farei o possível para fazer todas as tarefas com êxito, mas na sua empresa eu serei com certeza!!!"
        preview = "Você reconhece este Email?"
        date = "09 mar"
        stared = false
    },
    email {
        user = "LinkedIn.com"
        subject = "Seu emprego dos sonhos se encontra aqui! Não esqueça da sua vitória!"
        preview = "Olá David Willian, Você esta preparado para engressar na sua nova carreira??"
        date = "09 mar"
        stared = false
    },
    email {
        user = "EquipeOutlook.com"
        subject =
            "Sua faculdade dos sonhos esta na PUC Paraná! Venha realizar seus sonhos com a gente!!"
        preview = "Olá David Willian, Você gosta desse site?"
        date = "09 mar"
        stared = false
        unread = true
    },
    email {
        user = "Davidwilliandd@outlook.com"
        subject =
            "Me Contrate! Prometo que farei o possível para fazer todas as tarefas com êxito, mas na sua empresa eu serei com certeza!!!"
        preview = "Você reconhece este Email?"
        date = "09 mar"
        stared = true
        unread = true
    },

    )

