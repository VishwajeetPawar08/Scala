object Task2 {
  def main(args: Array[String]): Unit = {

//    Task 1: group by starting char (Vowel or Consonent)


    var names2 = Array("Aman", "Aryan", "Raj", "eesha", "Vishwajeet")
    val SetV = Set('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

    val grpNames = names2.groupBy(name => if (SetV.contains(name.charAt(0))) "Vowels" else "Consonenst")
    grpNames.foreach{
      case(key, value)=>println(s"$key: ${value.mkString(", ")}")
    }



  }

}
