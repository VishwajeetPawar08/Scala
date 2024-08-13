object Task3 {

  def bankingMenu(balance: Int): Unit = {
    import scala.io.StdIn
    var mbalance = balance
    var cont = true
    do {
      println("Choices are\t1:Check Balance\t2:Withdraw\t3:Deposit\t4:Exit")
      println("Enter choice: ")
      val ch = StdIn.readInt()
      if(ch==1){
        println(s"$mbalance Rupees in your bank account")
      }
      else if(ch == 2){
        println("Enter withdrawal amount: ")
        var amt = StdIn.readInt()
        if(amt<0){
          println("Amount cant be negative")
        }
        else if(amt>mbalance){
          println("No sufficient balance")
        } else{
          val newBal = mbalance - amt
          println(s"$amt Debited. New balance is $newBal")
          mbalance = newBal
        }

      }
      else if(ch == 3){
        println("Enter amount to be credited: ")
        var amt = StdIn.readInt()
        if(amt<0){
          println("Amount cant be negative")
        }
        else {
          println(s"$amt Credited to account")
          mbalance += amt
          println(s"New balance is $mbalance")
        }
      }else if(ch == 4){
        cont=false
      }
      else{
        println("Wrong choice..")
      }
    }while(cont)

  }

  def main(args: Array[String]): Unit = {
//    Create a banking menu
//    1. Check Balance
//    2. Withdraw amount
//    3. Deposit
//    4. Exit

    import scala.io.StdIn
    val id = 12345
    val pass = 12345678
    print("Enter Account Number: ")
    val acNum = StdIn.readInt()
    print("Enter Password: ")
    val acPass = StdIn.readInt()
    if(acNum == id && pass == acPass ){
      bankingMenu(5000)
    }

  }

}
