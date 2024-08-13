//Inheritance - Example demonstrates inheritance where subclass extends a superclass
class Animal(var name: String, var legs: Int) {
    def makeSound(): Unit = {
      println(s"$name having $legs legs and making sound")
    }
}

class Dog(name:String, legs:Int) extends Animal(name, legs){
  override def makeSound(): Unit = {
    println(s"$name says woof!")
  }

}

object InheritObj extends App{
  val animal = new Animal("Prafulla", 2)
  animal.makeSound()
  val dog = new Dog("Pankaj",20)
  dog.makeSound()
}
