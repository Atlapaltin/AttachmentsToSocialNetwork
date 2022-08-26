package ru.netology

data class VideoAttachment(
    val video: Video = Video()
) : Attachment {
    override val type: String = "video"
    data class Video(
        val id: Long = 0,
        val albumId: Long = 0,
        val ownerId: Long = 0,
        val userId: Long = 0
    )
}