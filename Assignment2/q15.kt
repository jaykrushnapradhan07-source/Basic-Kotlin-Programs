fun String.addExclamation(): String {
    return this + "!"
}

fun main() {

    val message = "Hello"

    println(message.addExclamation())
}