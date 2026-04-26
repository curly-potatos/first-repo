import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class FirstClassTest {

    @Test
    fun `should create FirstClass with given name`() {
        val name = "Test Name"
        val firstClass = FirstClass(name)

        assertEquals(name, firstClass.name)
    }

    @Test
    fun `should update name property`() {
        val firstClass = FirstClass("Initial Name")
        val newName = "Updated Name"

        firstClass.name = newName

        assertEquals(newName, firstClass.name)
    }

    @Test
    fun `displayName should print the name`() {
        val name = "Hello, Kotlin!"
        val firstClass = FirstClass(name)

        // This test just verifies the method runs without error
        assertDoesNotThrow {
            firstClass.displayName()
        }
    }
}
