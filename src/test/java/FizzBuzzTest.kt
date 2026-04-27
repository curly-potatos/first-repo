import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class FizzBuzzTest {

    @Test
    fun `returns Fizz when value is 3`() {

        val expected = "Fizz"

        val actual = FizzBuzz.compute(3)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `returns Buzz when value is 5`() {

        val expected = "Buzz"

        val actual = FizzBuzz.compute(5)

        assertThat(actual).isEqualTo(expected)
    }

    @ParameterizedTest
    @ValueSource(ints = [3, 6, 9])
    fun `returns Fizz when value is 3 6 or 9`(v: Int){

        val expected = "Fizz"

        val actual = FizzBuzz.compute(v)

        assertThat(actual).isEqualTo(expected)
    }

//    @ParameterizedTest
//    @ValueSource(ints = [5, 10, 20, 100])



    @ParameterizedTest
    @ValueSource(ints = [-1, 0, 150])
    fun `throws exception if value out of range`(n: Int){

        assertThrows<Exception> { FizzBuzz.compute(n) }

    }

    @ParameterizedTest
    @ValueSource(ints = [15, 30, 45])
    fun `returns FizzBuzz when value is multiple of 3 and 5`(v: Int){

        val expected = "FizzBuzz"

        val actual = FizzBuzz.compute(v)

        assertThat(actual).isEqualTo(expected)
    }

    @ParameterizedTest
    @ValueSource(ints = [1, 2, 11])
    fun `returns the value when value is not multiple of 3 or 5`(v: Int){

        val expected = v.toString()

        val actual = FizzBuzz.compute(v)

        assertThat(actual).isEqualTo(expected)
    }

}