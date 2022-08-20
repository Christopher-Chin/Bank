import kotlin.random.Random

fun main(args: Array<String>) {

    var customer = Customer("Chris",1,10000000)
    var bank = Bank()



    fun menu() {
        println(
            "Choose 1 for New Customer\n" +
            "Choose 2 for Existing Customer\n"  +
            "Choose 3 Show all Account "
        )


        val userInput = readLine()!!.toInt()
        println()
        when (userInput) {

            1 -> {
                println("***** Add your details *****")
                println("Add your details:")

                println("What is your full name:")
                var customerName = readLine()!!.toString()

                println("How much would you like to deposit?")
                var initialBalance = readLine()!!.toInt()
                val accountNumber = Random.nextInt(0, 1000)
                bank.customerList.add(Customer(customerName,accountNumber,initialBalance))

                println("We have successfully added your details to our system.")
                menu()
            }

            2 -> {
                println("Existing Customer")
                var customerName = readLine()!!.toString()
                bank.existCustomer(customerName)
            }

            3 -> {
                bank.showCustomerList()
                menu()
            }
        }
    }
    menu()
}