package ru.netology

data class WikiAttachment(
    val wiki: Wiki = Wiki()
) : Attachment {
    override val type: String = "wiki"
    data class Wiki(
        val id: Long = 0,
        val groupId: Long = 0,
        val title: String = ""
    )
}