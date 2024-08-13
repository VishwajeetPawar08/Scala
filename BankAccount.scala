import jdk.jfr.DataAmount

class Account(val accountNum: String, var balance: Double) {
  def deposit(amount: Double): Unit = {
    if(amount>0){
      balance+=amount
      println(s"$amount creadited to account.. New balance is $balance")
    }
  }

  def withdraw(amount: Double): Unit = {
    if(amount>0 && amount<=balance){
      balance-=amount
      println(s"Withdraw $amount is successfull.. New balance is $balance")
    }else{
      println("Insufficient balance or Invalid Amount")
    }
  }

  def getBalance: Double = balance
}

object BankingApp{
  def main(args: Array[String]): Unit = {
    //create an instance
    val account1 = new Account("UST1001", 20000)
    val account2 = new Account("UST1002", 100000)
    val account3 = new Account("UST1003", 9000)
    val account4 = new Account("UST1004", 50000)
    println(s"${account1.accountNum}, Initial balance : ${account1.balance}")
    account1.deposit(30000)
    account1.withdraw(3000)
    println(s"${account1.accountNum}, Final balance : ${account1.balance}")
  }
}
