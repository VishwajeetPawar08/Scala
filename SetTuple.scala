object SetTuple {
  def main(args: Array[String]): Unit = {
    //Set Collection: Immutable collection
    //Hashset : mutable collection

//    val set_1  : Set[String] = Set()
//    val set_2 = Set()

    import scala.collection.mutable.Set
    val mutableSet = Set("Apple", "Orange", "Banana", "Grapes");
    mutableSet+= "Mango"
    mutableSet-= "Apple"

    //------------------------TUPLE---------------------
    // Immutable, fixed size, heteregenous data type holder, indexing from 1 not 0
    val tuple_1 = (10,20,30,40,50,60,70,80)
//    tuple_1._1 = "Hello" won't work because it's immutability
    println(tuple_1._2) //will return 20

  }
}
