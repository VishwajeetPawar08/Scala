object DSMethods {
  def main(args: Array[String]): Unit = {
//    List & It's methods
    val list1 = List("apple", "coconut", "banana", "oranges", "cherry", "mango")

    var list2 = List() //empty list

    val firstElement = list1.head
    val lastElement1 = list1.last
    val lastElement2 = list1.tail
    val secondElement = list1(1) //return element at index 1

    //print(list1.isEmpty) //will return the boolean. checks list is empty or not

    val length = list1.length //to check the length. same applied for other collections also

//    Adding and removing from the list
    var list3 = List(1,2,3,4,5,6,7,8)
    val newList = 0::list3 // new list = (0,1,2,3,4,5,6,7,8)
    val appendList = list3:+9
//    print(newList, appendList)

//    concatination between 2 lists
    val concatList1 = list2 ::: List(10,11,12,13)
    val concatList2 = list2 ++ List(9,10,11,12)
    //print(concatList1, "\n",concatList2)

//    Removing or Dropping values fro  list
    //print(concatList1.drop(2)) //will remove first 2 elements from list
    val updatedList1 = concatList1.filter(_ != 11) //will remove 11 fro  list
    //print(updatedList1)

    val updatedList2 = concatList1.diff(List(12,13,14)) //will remove 12,13,14 from list if they present
    //print(updatedList2)

//    Transforming List
    //print(list3.map(_*2)) //will multiply by 2 to all elements in list
    //print(list3.filter(_%2==0)) //will return elements divisible by 2

    val nestedList = List(List(1,2,3), List(4,5,6), List(7,8))
    val flatList = nestedList.flatMap(identity) //will add all elements in 1d list
    //print(flatList)

    val sum = flatList.reduce(_+_) //will give the sum of all elements in list --Aggregate operation
    val sum2 = flatList.sum //will give sum
    //print(sum , sum2)

    val mul = flatList.reduce(_*_) //will give product of all elements in list
    //print(mul)

//    Slicing and Subsets of List

    //print(list1.take(3)) //first 3 elements
    //print(list1.takeRight(3)) // last 3 elements

    //print(list1.drop(2)) //drop first 2
    //print(list1.dropRight(2)) //drop last 2

    //print(list1.slice(1,4)) //return 1 to 4 elements

//    Converting list to map
    val listOfTuple = List(("UST1001", "Krishna"), ("UST1002", "Rohit"), ("UST1003", "Shas"),  ("UST1004", "Ananda"))
    val map = listOfTuple.toMap
    //print(map)

//    Zipping List
    val zippedList = list3.zip(list1)
    //print(zippedList)

    val (fruits, numbers) = zippedList.unzip
    //println(fruits)
    //print(numbers)

//    Sets and sets' methods
    val set1 = Set(1,2,3,4,5,6,7,8)
    val set2 = ("apple", "coconut", "banana", "oranges", "cherry", "mango")

    //print(set1.contains(3))
    //println(set1+9)
    //print(set1-5)

//    Set operations
    val SetA = Set(10,20,30,40)
    val SetB = Set(50,60,70,30, 40)
    val UnionSet = SetA union SetB
    //print(UnionSet)
    val intersectSet = SetA intersect SetB
    //print(intersectSet)

    //print(SetA diff SetB)
    //print(SetA.subsetOf(SetB))

    //println("multiply by 2: " + SetA.map(_*2))
    //println("divisible by 20: " + SetA.filter(_%20 == 0))
    //println("Sum of all elements in Set is: ", SetA.reduce(_+_))
    //SetA.foreach(print)

//    Array
    val array1 = Array("Pune", "Mumbai", "Sangli", "Kolhapur", "Satara")
    val array2 = Array(1,2,3,4,5,6,7,8)

    val empArray = Array[Int]() //Empty Array
    array2(0) = 10
    array2(0) += 9

    import scala.collection.mutable.ArrayBuffer

    //Adding elements (Array are fixed size, so use arrayBuffer)
    val arrayBuffer = ArrayBuffer(1,2,3,4,5,6,7)
    arrayBuffer += 8
    arrayBuffer -= 5
    arrayBuffer.map(_*2)
    arrayBuffer.reduce(_+_)
    arrayBuffer.filter(_%5==0)

    val array3 = arrayBuffer.toArray //will covert and store in array
    val nestedArray = Array(Array(1,2,3), Array(4,5,6), Array(8,9))
    val nestedArray2 = nestedArray.flatten
    nestedArray2.slice(1,4)

    val array4 = Array(5,3,8,290,89,933,932)
    //print(array4.sorted)
    //print(array4.reverse)

//    Groupby method in scala
    var places = List("Aundh", "Pune Station", "Kothrud", "Katraj", "Warje", "Swargate")
    val groupByLen = places.groupBy(_.length)
    val groupByFirstChar = places.groupBy(_.charAt(0))
    val grpByOddEven = flatList.groupBy(num => if(num%2==0) "even" else "odd")
    //print(grpByOddEven)

//    grpByOddEven.foreach{
//        case(key, value)=>println(s"$key: ${value.mkString(", ")}")
//    }

    val trial1 = places.groupBy(_.contains("a")) //startswith, endwith also works
    //print(trial1)

//      Collection - Map

      import scala.collection.immutable
      val immutableMap = Map("a"->1, "b"->2, "c"->3, "d"->4, "e"->5)
      import scala.collection.mutable
      val mutableMap = mutable.Map("a"->1, "b"->2, "c"->3, "d"->4, "e"->5)
      //println(mutableMap.contains("a")) //same works for immutable also. Result in True or False
      //println(mutableMap("a")) //same works for immutable also. Result in 0 or 1


      val mapA = Map("a"->1, "b"->2, "c"->3)
      val mapB = Map("d"->4, "e"->5, "f"->6, "g"->7)
      val mergedMap = mapA++mapB
      //println(mergedMap)

      val incrementValue = immutableMap.mapValues(_+1)
      val transformKey = immutableMap.map{ case(k,v) => (k.toUpperCase, v)}
      //print(incrementValue+ "\n " + transformKey)

      incrementValue.foreach{
          case(key, value) => println(s"$key -> $value")
      }


  }

}
