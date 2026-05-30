fun check(ch: Char) {

    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
       ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

        println("Vowel")
    }
    else {

        println("Consonant")
    }

}

fun main() {

    check('A')
}