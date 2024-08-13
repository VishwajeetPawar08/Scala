import scala.util.Random

object AssignementTask1 {
  def main(args: Array[String]): Unit = {
    println("Enter required length of password: ")
    val len = scala.io.StdIn.readInt()
    var password = ""
    if(len>8){
      password = generatePassword(len)
      print(s"$len lenghtened password has been created.\nPassword is $password")
    }else{
      println("Entered length is not suitable.! TRY AGAIN..!")
    }

  }

  def generatePassword(len:Int): String={
//    val length = len
    val lowerChars = "abcdefghijklmnopqrstuvwxyz"
    val upperChars = lowerChars.toUpperCase()
    val specialChars = "~!@#$%^&*()_-+=[]{};:<>?/"

    val password1 = (1 to len/3).map(_=>lowerChars(Random.nextInt(lowerChars.length))).mkString
    val password2 = (len/3+1 to 2*len/3).map(_=>upperChars(Random.nextInt(upperChars.length))).mkString
    val password3 = (2*len/3+1 to len).map(_=>specialChars(Random.nextInt(specialChars.length))).mkString

    var password = password1+password2+password3

    password
  }
}
