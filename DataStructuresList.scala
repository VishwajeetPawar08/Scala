object DataStructuresList {

  def main(args: Array[String]): Unit = {

//    ---------------------------LIST-----------------------------------------
    //Immutable, homogeneous collection
    val fruits: List[String] = List("Mango", "Pineapple", "Coconut")
    val nums: List[Int] = List(1,2,3,4,5,6,7)
    val arr: List[Any] = List(1,2,'a', 'b', "asw", "qew", true, 4.87)

    val List1 = List("Hadoop", "Scala", "Azure", "Git", 1,2,3,4, true)

    val emptyList: List[Nothing] = List()
    val emptyList2 = List()

    println(fruits)
    println("First element: "+ fruits.head)
    println("last elements (excluding 1st all will be): "+ fruits.tail)
    println("last element : "+ fruits.tail(1))
    println("last element : "+ fruits.last)

    print(List1.getClass)


    //--------------------------------ARRAY DATATYPE------------------------
    //Array is mutable and fixed size collection
    //Array is homogeneous collection
    println()
    var arrayData = Array("Apple", "Watermelon", "Guava", "Grapes", "Oranges")
    arrayData.foreach(println)

    println(arrayData.mkString(", "))
    arrayData(0) = "Banana"
    println(arrayData.mkString(", "))



  }

}
