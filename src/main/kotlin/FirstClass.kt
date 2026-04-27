class FirstClass(var name: String) {
    fun displayName() {
        println(name)
    }
}



fun main() {
    val obj = FirstClass("Hello, Kotlin!")
    obj.displayName()
}