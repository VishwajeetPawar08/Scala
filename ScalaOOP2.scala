//Class with companion object using Scala
//Companion objects can be used to provide factory method and utility functions related to class
//companion objects have same name as of class name, same scope it resides within file
//Access to private members of class or traits
//This can be accessed directly using class name without any instance of class


class Circle (val radius:Double) {
  def area: Double = Math.PI * radius*radius
  def circumference: Double = 2*Math.PI * radius

}
object circle{
  def apply(radius: Double): Circle = new Circle(radius)
}

object CompanionObj extends App{
//  var circle = Circle(6.0)
//  println(circle.area)
//  println(circle.circumference)
}