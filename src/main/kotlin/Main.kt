package ru.netology

fun main() {
    val post1 =  Post(
        id = 0,
        ownerId = 1,
        text = "Posted",
        date = 1663718400,
        likes = Likes(count = 5),
        attachment = arrayOf(
            PhotoAttachment(),
            VideoAttachment(),
            WikiAttachment()
        )
    )

    val post2 =  Post(
        id = 0,
        ownerId = 1,
        text = "Posted again",
        date = 1663718400,
        likes = Likes(count = 5)
    )
    post1.attachment.forEach { println(it) }
    val service = WallService

    val postAdded1 = service.add(post1)
    val postAdded2 = service.add(post2)
    service.addAtachment(postAdded2.id, PhotoAttachment())

    val postWithAttachment = service.getPostById(postAdded2.id)
    println("postWithAttachment: $postWithAttachment")
    println("added1: $postAdded1")

    val post3 =  Post(
        id = 2,
        ownerId = 1,
        text = "Another post",
        date = 1663718400,
        likes = Likes(count = 5)
    )
    val res = service.update(post3)
    println("Post has been updated: $res")
}