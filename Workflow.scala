object Workflow {
  def main(args: Array[String]): Unit = {
//    ----------------------MAP FUNCTION-------------------------
    //It transforms each element of a collection using given function
    val numbers = List(1,2,3,4,5,6,7,8)
    //println(numbers.map(_*2))
    //println(numbers.map(_+" Number"))
    val strNum = numbers.map(_+" Number")
    //print(strNum)
    //strNum.foreach(println)

    val words = List("Apple", "Banana", "Mango", "Guava", "Watermelon")
    //print(words.map(_.length))


//    -----------FLAT MAP-------------------
    //This function flattens multi dimensional collection into a single dinmensional collection
    val nestedList = List(List(1,2,3), List(4,5,6,7), List(8))
    //print(nestedList.flatMap(identity))
    val newNest = nestedList.flatMap(identity)
    //newNest.foreach(print)

    val sentences = List("Scala is a programming language", "Scala is an awesome coding language")
    val words2 = sentences.flatMap(_.split(" "))
    //words2.foreach(println)

//    --------------------FILTERING-----------------------
    //It selects elements from collection that satisfies condition

    //println(words2.groupBy(_.length))
    val shortWords = words2.filter(_.length <= 4)
    //println(shortWords)


//    -------------------FOLD--------------------
    //This combines elements of a collection using a binary operation starting with an initial value
    //Similar with reduce function
    //println(numbers)
    //print(numbers.fold(0)(-_+_)) //zero is a initial value


//    --------------------REDUCE-----------------
    //Combines a elements of collection but doesn't require any initial position
    val words3 = List("Prafulla", "is", "a", "best", "HR")
    val sentence = words3.reduce(_+" "+_)
    //print(sentence)


//    ------------------------FOREACH=-----------------------------
    //applies a given procedure to all elements is a collection
    //words.foreach(word => println(word.toUpperCase))



//    ------------------------COLLECT----------------------
    //collect function applies a partial function to the elements of collection and returning a new collection

    val numbers1 = List(1,2,3,4,5,6,7,8,9,10)
    val even = numbers1.collect{case x if x%2 == 0 => x}
    //println(even)

    val wordd = List("int", "string", "boolean", "float", "long")
    val largeWord = wordd.collect{case x if x.length >= 5 => x+"OOO"}
    //println(largeWord)


//    -----------------------PARTITION---------------------
    //This function will split collections into two parts based on the condition which can be stored in two different collections
    val (lngWords, shrtWords) = wordd.partition(_.length >=5)
    //println(shrtWords, lngWords)


//    ------------------------GroupBy-----------------------
    //The groupby function groups a collection based on the condition and differentiated as true grop and false group
    val num = List(11,12,13,14,15,16,17,18,19,20)
    val evenn1 = num.groupBy(_%2) //will give 0,1 group
    val evenn2 = num.groupBy(_%2==0) //will give true, false group
    //print(evenn1, evenn2)



//    -------------------------SCAN---------------------------
    //similar to fold but it returns collection of successive cumulative results of binary operation
    val temp = num.scan(0)(_+_) //zero is a initial value
    print(temp) //will give 0,11,23,36,50,65...

  }

}
