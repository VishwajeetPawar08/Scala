object LoopsFunctions {
  def main(args: Array[String]): Unit = {
//    ---------------------Do While loop-----------------------

    /*
    var j = 1
    do{
      println(j)
      j += 1
    }while(j <= 5)

     */

     /*
    for version 3.3.3
    while{
      print(j)
      j+=1
      j<=5
    }do()

     */

//    ---------------------For loop with range and step size-----------------------
    /*
    for (i <-1 to 10 by 1){
      println("to " + i)
    }

    for (i <-1 until 10 by 1){
      println("until "+i)
    }
    to will run  1 to 10 while until will run 1 to 9
     */

    /*
    val fruits = List("apple", "mango", "watermelon", "grapes", "oranges")
    for(fruit <- fruits){
      println(fruit)
    }

     */


    import scala.io.StdIn
    /*
    print("Enter Temprature: ")
    val temprature = StdIn.readLine().toInt
    print("Enter Humidity: ")
    val humidity = StdIn.readInt()

    println(s"Temprature is $temprature and Humidity is $humidity")

    val waetherDesc = if (temprature>30 & humidity>60){
      "Hot & Humid"
    }else if(temprature>45){
      "Extreme Hot"
    }else if(humidity > 70){
      "Extreme Humid"
    }else{
      "Pleasant"
    }

    print(waetherDesc)

     */



//    -------------------------FUNCTIONS-------------------

    def add(a: Int, b: Int): Int = {
      a+b
    }

    //print(add(3,4))

    //Anonymous functions like Lambda
     val summation = (a:Int, b:Int)=>a+b
    //println(summation(5,6))

    def findMax(lst: List[Int]): Int ={
      lst.max
    }
    val numbers = List(1,2,3,6,8,9,23)
    //print(findMax(numbers))

    //Recursive Functions
    def factorial (num: Int): Int={
      if(num==0){
        1
      }else{
        num*factorial(num-1)
      }
    }
    print("Enter number: ")
    var num = StdIn.readInt()
    print(factorial(num))

  }

}
