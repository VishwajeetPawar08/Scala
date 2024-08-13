object MapsIterators {
  def main(args: Array[String]): Unit = {
    //-------------------------MAP--------------------------------
    // Key-Value pair, key can't be repeated but values can be.
//    import scala.collection.immutable.Map
    var mapvar: Map[String, Int] = Map()
    var mapvar1 = Map("UST1001"->"Sandeep", "UST1002"->"Midul", "UST1003"->"Vinesh", "UST1004"->"Adinan")
//    println(mapvar1.contains("UST1003"))
//    println(mapvar1.get("UST1003"))
//    println(mapvar1.keys) //print all keys
//    println(mapvar1.values) ////print all values

    import scala.collection.mutable.Map
    val mutable_var = Map("UST1001"->"Sandeep", "UST1002"->"Midul", "UST1003"->"Vinesh", "UST1004"->"Adinan")
    mutable_var("UST1001") = "Rohit"
    mutable_var += ("UST1005" -> "Siva")


    //-----------------------------ITERATORS--------------------------------
    //represents a sequence of elements allows you to traverse through a collection sequence

    val myList = List(2,3,4,5,6,7,8,9)
    val iter = myList.iterator
    //method of iterator to check if their is more elements (.hasNext()), .next() to retrieve the next value
    //.remove to remove elements from mutable iterators

    println(iter.next())
    println(iter.next())

    //lazy initialization using scala
    lazy val donut: Int = 100
    println(donut*5)

//    lazy var donuts: Int = 200 will give error. lazy can't be used with var



  }

}
