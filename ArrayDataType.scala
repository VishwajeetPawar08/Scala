object ArrayDataType {

  def main(args: Array[String]): Unit = {
    //Declare 1d blank array
    var arr_1 = new Array[String](10)
    //create 2d empty array
    val arr_2 = Array.ofDim[Int](2,2)

    arr_2(0)(0)=234
    arr_2(0)(1)=135
    arr_2(1)(0)=911
    arr_2(1)(1)=102

    val flattenArray: Array[Int] = arr_2.flatten
//    println(flattenArray.mkString(", "))

    val list = 1::2::3::4::5::Nil

//    ------------------------------LIST BUFFER-------------------
    import scala.collection.mutable.ListBuffer
    var cities = new ListBuffer[String]()
    cities += "Pune"
    cities += "Sangli"
    cities += "Satara"
    cities += "Kolhapur"
    cities += ("Mumbai", "Solapur")
    cities += "Trivandrum"
    cities -= "Trivandrum"

    println(cities)



  }

}



