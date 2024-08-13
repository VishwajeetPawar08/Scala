class Car(var make:String, var model:String, var year:Int){

  def displayInfo(): Unit = {
    println(s"Car Info: $year , Model: $model, Maker: $make")
  }

}

object SimpleClass extends App{
  val car = new Car("Toyota", "Crysta", 2020)
  car.displayInfo()

  //modify the values of a class
  car.model = "LC"
  car.displayInfo()
}