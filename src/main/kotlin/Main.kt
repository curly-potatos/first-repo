fun main() {
    // Example usage of FirstClass
    val firstClass = FirstClass("Hello from Main")
    firstClass.displayName()

    // Example usage of FizzBuzz
    println("\nFizzBuzz output:")
    for (i in 1..15) {
        println("$i: ${FizzBuzz.compute(i)}")
    }
}
