import java.time.temporal.TemporalAmount
import kotlin.random.Random

class Customer(var userName:String, var accountNumber:Int, var initialBalance:Int){

    var bank = Bank()

    fun withdraw(){
        var userInput = readLine()!!.toInt()
        if(initialBalance>=0){
            var balance = initialBalance-userInput
            println("Your balance is $balance, collect your money")
        }
        else{
            println("You have insufficient funds")
        }
    }

    fun deposit(amount:Int){
        var userInput = readLine()
        var balance = initialBalance+amount
        println(balance)
    }

    fun checkBalance(){
        println(initialBalance)
    }

    //




    //Check user validity


    //▪Display the string” You've withdrawn $******. Collect your Money”

    //Check user validity
    //▪Ask user for amount to deposit [integer value]
    //▪Update the balance with new balance after deposit.
   // ▪Display the string” Thank You money is remitted”
   // Check(//pass parameters if required)
   // For the user
   // Check user validity

    //DISPLAY FUNCTION FUNCTIONALITY
    //Check user validity
    //▪Display the balance in the account, with Username and Account number.
}