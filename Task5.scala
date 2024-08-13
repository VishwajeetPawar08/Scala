object Task5 {
  def main(args: Array[String]): Unit = {
    val employee = Map("Aman"->5000, "Praful"->4000, "Parag"->  1000, "Sachet"->500)
    val sumSal = employee.values.reduce(_+_)
    val (lowSal, maxSal) = employee.values.partition(_<(sumSal*0.1))
    println("Partion done at "+(sumSal*0.1))
    println("Low salaries "+lowSal)
    println("Max salaires "+maxSal)

    val employee2 = List(("Aman",5000), ("Praful",4000), ("Parag",1000), ("Sachet",500))
    val sumSal2 = employee2.map(_._2).sum
    val(lowSal2, maxSal2) = employee2.partition(_._2<= (0.1*sumSal2))
    println("Low salaries using list of tuple"+lowSal2)
    println("Max salaries using list of tuple"+maxSal2)


  }

}
