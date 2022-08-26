package ru.netology

data class GraffitiAttachment (
    val graffity: Graffiti = Graffiti()
) : Attachment {
    override val type: String = "graffiti"
    data class Graffiti(
        val id: Long = 0,
        val ownerId: Long = 0,
        val photo130: String = "",
        val photo604: String = ""
    )
}