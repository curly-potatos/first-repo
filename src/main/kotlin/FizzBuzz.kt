
private const val BUZZ = "Buzz"

private const val FIZZ = "Fizz"

private const val FIZZ_BUZZ = "$FIZZ$BUZZ"

class FizzBuzz {

    companion object {
        fun compute(n: Int): String {

            if (n < 1 || n > 100) {
                throw RuntimeException("number out of range")
            }

            if (n % 3 == 0 && n % 5 == 0) {
                return FIZZ_BUZZ
            }

            if (n % 3 == 0) {
                return FIZZ
            }

            if (n % 5 == 0) {
                return BUZZ
            }

            return n.toString()
        }
    }
}