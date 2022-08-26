package ru.netology

data class PhotoAttachment(
    val photo: Photo = Photo()
) : Attachment {
    override val type: String = "photo"
    data class Photo(
        val id: Long = 0,
        val albumId: Long = 0,
        val ownerId: Long = 0,
        val userId: Long = 0
    )
}