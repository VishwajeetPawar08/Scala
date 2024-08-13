import scala.io.Source

object Task4 {
  def main(args: Array[String]): Unit = {
    //    ---------------------------------------------GDP---------------------------------------------------
    //Task1. Find states with highest GDP contribution
    //Task2. Find avg gdp per capita
    //task3. Total GDP
    val filePath2 = "C:\\Users\\Administrator\\Downloads\\StatewiseGDP.csv"
    //read file from the path

    val source2 = Source.fromFile(filePath2)
    var gdp = List()
    var totalGDP = 0.00
    var maxGDP = 0.00
    var maxGDPState = ""
    var avg = 0.00
    var gdpSum = 0.00
    var capitaSum = 0.00
    for(line <- source2.getLines.drop(1)){
      val columns = line.split(",")
      //columns.foreach(println)
      totalGDP += columns(1).toDouble
      if(columns(1).toDouble > maxGDP){
        maxGDP = columns(1).toDouble
        maxGDPState = columns(0)
      }

      gdpSum += columns(1).toDouble
      capitaSum += columns(2).toDouble

    }
    println(s"$totalGDP is a total GDP")
    println(s"$maxGDP is a highest GDP of state $maxGDPState")
    println(s"Average of GDP $gdpSum per Capita $capitaSum is "+ gdpSum/capitaSum)



  }

}
