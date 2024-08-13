object ControlStatementt {
  def main(args: Array[String]): Unit = {
    //Example 1: If else
    import scala.io.StdIn
    println("Enter number: ")
    //Ask user to input and typecast the input data in integer format
    var x1 = StdIn.readLine().toInt

    /*
    if(x1>0){
      println(s"Entered value $x1 is positive")
    }else if(x1==0){
      println("Value is 0 i.e. Neutral")
    }else{
      println(s" Entered value $x1 is negative")
    }*/

    //Example2: Using if else as an expression
    /*
    val output = if(x1%2 == 0) "even" else "odd";
    println(s"$x1 is $output")*/


    //Example3: While loop using scala

    /*
    while (x1>=5){
      println(s"Value of i is $x1")
      x1 -= 1
    }
    */

    //Example4: For loop
    //in list index get incremented automatically
    /*
    var list1 = List("Pune","Aundh", "UST", "UST10001", 9887, "CSE", true)
    for(value <- list1){
      println(value)
    }
    */


    //Example5: Generate collection of even numbers
    /*
    val numbers = (1 to 50).toList
    val even = for{
                  num <- numbers
                  if num%2 == 0
                } yield num

    println(even)
    */

    //Example6: Generate a collection of prime number
    /*
    val list1 = (2 to 100).toList

    val primes = for{
      num <- list1
      if (2 until num).forall(x => num%x != 0)
    }yield num

    println("Prime numbers: " + primes)
    */

    //----------------------------TASKS----------------------------------
    //productname, price, discount, quantity
    //1. Filter out the products that have price grrater than $50
    //2. Calculate the total cost of each product
    //3. print the name of products that has exceeded total cost greater than $300
    //4.

  }
}
