fun sum(n: Int): Int {

    var total = 0

    for(i in 1..n) {
        total = total + i
    }

    return total
}

fun main() {

    val result = sum(5)

    println("Sum = $result")
}