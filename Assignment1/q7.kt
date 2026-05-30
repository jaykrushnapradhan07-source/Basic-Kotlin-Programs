fun largest(a: Int, b: Int, c: Int): Int {

    if(a >= b && a >= c) {
        return a
    }
    else if(b >= a && b >= c) {
        return b
    }
    else {
        return c
    }
}

fun main() {

    val result = largest(10, 25, 15)

    println("Largest Number = $result")
}