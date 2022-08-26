package ru.netology

data class EventAttachment(
    val event: Event = Event()
): Attachment {
    override val type: String = "event"
    data class Event(
        val id: Long = 0,
        val time: Int = 0,
        val memberStatus: Int = 0,
        val isFavorite: Boolean = false,
        val address: String = "",
        val text: String = "",
        val buttonText: String = ""
    )

}