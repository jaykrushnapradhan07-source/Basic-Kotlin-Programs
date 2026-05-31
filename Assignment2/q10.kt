sealed class ScreenState

object Loading : ScreenState()

data class Success(val data: String) : ScreenState()

fun main() {

    var state: ScreenState = Loading

    println(state)

    state = Success("Data Loaded Successfully")

    println(state)
}