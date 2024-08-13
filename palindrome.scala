import scala.io.StdIn.readLine
import scala.collection.mutable

object palindrome {
  def main(args: Array[String]): Unit = {
    println("Enter a string: ")
    val stringg = readLine().toString
    if(stringg == stringg.reverse){
      print("Palindrome it is")
    }else{
      print("not palindrome")
    }
  }
}