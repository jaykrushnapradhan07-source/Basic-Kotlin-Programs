fun main() {

    var num = 12345
    var count = 0

    while(num != 0) {

        num = num / 10
        count++
    }

    println("Number of Digits = $count")
}