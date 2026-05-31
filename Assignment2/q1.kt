class Bankaccount{
    private var balance: Double=0.0
    fun deposit(amount: Double){
        balance=balance+amount
    }
    fun getbalance(): Double{
        return balance
    }
}
fun main(){
    val account = Bankaccount()
    account.deposit(4000.00)
    println(account.getbalance())
}