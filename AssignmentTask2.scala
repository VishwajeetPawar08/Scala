import scala.io.StdIn.readLine
import scala.collection.mutable

case class Item(name: String, var quantity: Int, price: Double, category: String)

object AssignmentTask2 {
  var cart = mutable.Map[Int, Item]()
  var itemIdCounter = 1
  var total = 0.0
  def main(args: Array[String]): Unit = {
    print("Welcome to UST shopping cart..!")

    val deliveryCharges = 30

    println(s"""Please choose an option: \n1. Add a new item\n2. Update an existing item\n3. Remove an item\n4. View cart\n5. Calculate total price\n6. Make payment\n7. Exit""")
    var flag = true
    while (flag) {
      println("Option:")
      val opt = readLine().toInt
      if (opt == 1) addNewItem()
      else if (opt == 2) updateItem()
      else if (opt == 3) removeItem()
      else if (opt == 4) viewCart()
      else if (opt == 5) calculatePrice()
      else if (opt == 6) makePayment()
      else if (opt == 7) {
        println("Exiting the application. Goodbye!")
        flag = false
      }
      else {
        println("Wrong choice..!! Choose correct option again")
      }
    }
  }

    def addNewItem(): Unit = {
      println("Enter item name: ")
      val name= readLine().toString
      println("Enter quantity: ")
      val quantity = readLine().toInt
      println("Enter price: ")
      val price = readLine().toInt
      println("Enter category: ")
      val category = readLine().toString
      cart(itemIdCounter) = Item(name, quantity, price, category)
      itemIdCounter+=1
      println("Item added successfully!")
    }
    def updateItem():Unit={
      println("Enter item id to update the cart: ")
      val id = readLine().toInt
      if(cart.contains(id)){
        println("Enter new quantity: ")
        val quantity = readLine().toInt
        cart(id).quantity = quantity
        println(s"Quantity updated successfully to $quantity")
      }else{
        println("Wring Item id, ID doesn't exists in your cart..")
      }
    }
    def removeItem(): Unit = {
      println("Enter id of item you want to remove: ")
      val id = readLine().toInt
      if(cart.contains(id)){
        cart.remove(id)
        println(s"Item with id: $id has been removed successfully")
      }else{
        println("Wrong ID provided. Try Again")
      }
    }
    def viewCart(): Unit = {
      println("Your cart:")
      for((id, item)<- cart){
        println(s"$id. [${id}] ${item.name} \t Quantity: ${item.quantity} \t price: ${item.price}\t Category: ${item.category}")
      }
    }
    def calculatePrice(): Unit = {
      for((id, item)<-cart){
        println(s"${id}: \t Name: ${item.name} \t PricePerUnit: ${item.price}\t Quantity: ${item.quantity} \t Total: ${item.quantity*item.price}")

      }
      total = cart.values.map(item=>item.price*item.quantity).sum

      val tax = total *0.05
      println(s"Taxes: $tax")
      total += tax
      if(total<200){
        println("Delivery charges : 30")
        total +=30
      }
      println(s"Total billing price is ${total}")
    }
    def makePayment(): Unit = {
      println("Choose a payment method (Credit Card/Debit Card/UPI)")
      val method = readLine().toString
      println(s"Processing payment of ${total} using Credit Card...")
      println("Payment successful! Confirmation number: UST123456789")
    }

}
