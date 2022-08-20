class Bank {
    var customerList = ArrayList<Customer>()

    fun existCustomer(name:String) {
        for (i in customerList) {
            if (name.equals(i.userName)) {
                println(
                    "Choose 1 for Deposit\n" +
                    "Choose 4 for Check Balance\n" +
                    "Choose 5 for EXIT\n"
                )
            }
            else{
                println("Customer doesn't exist name")
            }
        }
    }

    fun showCustomerList(){
        for(i in customerList){
            println( "userName: ${i.userName}\naccountNumber: ${i.accountNumber}\ninitialBalance Level: ${i.initialBalance}\n\n")
        }
    }
}
