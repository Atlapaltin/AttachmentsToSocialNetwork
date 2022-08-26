import org.junit.Test
import org.junit.Assert.*
import ru.netology.Likes
import ru.netology.Post
import ru.netology.WallService

class WallServiceTest {

    @Test
    fun add() {
        val post1 =  Post(
            id = 0,
            ownerId = 1,
            text = "Test text",
            date = 1663718400,
            likes = Likes(count = 5)
        )

        val service = WallService
        val added1 = service.add(post1)
        assertNotEquals(0,added1.id)
    }

    @Test
    fun updateExistId() {
        var post1 =  Post(
            id = 0,
            ownerId = 1,
            text = "Test text",
            date = 1663718400,
            likes = Likes(count = 5)
        )

        val postNew =  Post(
            id = 1,
            ownerId = 1,
            text = "New test",
            date = 1663718400,
            likes = Likes(count = 5)
        )
        val service = WallService
        val result = service.update(postNew)
        assertEquals(true, result)
    }

    @Test
    fun updateNotExistId() {
        var post1 =  Post(
            id = 0,
            ownerId = 1,
            text = "Test text",
            date = 1663718400,
            likes = Likes(count = 5)
        )

        val postNew =  Post(
            id = 3,
            ownerId = 1,
            text = "New test",
            date = 1663718400,
            likes = Likes(count = 5)
        )
        val service = WallService
        val result = service.update(postNew)
        assertEquals(false, result)
    }
}