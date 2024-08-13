//case class are special classes in scala programming that are immutable and are compared by value
//They are ideal for use in pattern matching

case class Person(name:String, salary:Int)
  object CaseClass extends App{
    //create an Instance of case class
    val person1 = Person("Aman", 7000)
    val person2 = Person("Amol", 10000)
    //print the person details
    println(person1)
    println(person2)
    //copy case class
    val person3 = person1.copy(salary = 2500)

    //Pattern matchingwith case class
    //pattern matching in scala allows you to match values against pattern and execute code based on the matched
    person1 match{
      //case pattern1 => result1
      //case pattern2 => result2
      case Person(name, salary)=>println(s"Name: $name, Salary: $salary")
    }

}
