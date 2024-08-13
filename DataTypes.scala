
// Object is a singletone instance that is lazily instance  when it is first accessed. It is similar class but only one instance will be created automatically.


object DataTypes {
  //main is an entry point to scala application
  // unit defines the return type of main indication that it returns nothing
  def main(args:Array[String]):Unit={
    //Integer datatype
    val intNum: Int = 8657
    val longNum: Long = 2345645678L
    val shortNum: Short = 623
    val byteNum: Byte = 127

    //Floating datatypes
    val floatingNum: Float = 3.14f
    val doubleNum: Double = 3.14567886556

    //String datatype
    val stringVar: String = "Hello SCALA"

    //Character datatype
    val charVar: Char = 'A'

    //Unit datatype : Similar to void
    val unitValue: Unit = ()

    //MUTABLE DATA TYPES::::::::::::
    //Boolean
    var boolvar: Boolean = true
    var intvarr: Int = 6125

    println(s"Integer:  $intNum")
    println(s"longNum:  $longNum")
    println(s"shortNum:  $shortNum")
    println(s"byteNum:  $byteNum")
    println(s"floatingNum:  $floatingNum")
    println(s"stringVar:  $stringVar")
    println(s"unitValue:  $unitValue")
    println("boolvar: " + boolvar)
    print(" mutable int 2nd: " + intvarr)

    intvarr += 4000
    println(s"New value is : $intvarr")
  }
}
