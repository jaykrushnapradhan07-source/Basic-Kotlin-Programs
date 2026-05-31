data class User(
    val id: Int,
    val username: String,
    val isActive: Boolean
)
fun main() {
    val user = User(1, "Jay", true)
    val newUser = user.copy(isActive = false)
    println("Original User: $user")
    println("Copied User: $newUser")
}