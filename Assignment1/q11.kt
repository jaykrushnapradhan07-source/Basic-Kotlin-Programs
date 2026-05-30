fun main() {

    var num = 1234
    var sum = 0

    while(num != 0) {

        val digit = num % 10

        sum = sum + digit

        num = num / 10
    }

    println("Sum of Digits = $sum")
}