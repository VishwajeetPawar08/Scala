import scala.io.Source
import scala.io.StdIn.readLine

class FileAnalyzer(){
  var charCount=0
  var wordCount=0
  def loadFile(filePath: String): Unit = {
    val source = Source.fromFile(filePath)
    val lines = source.getLines().toList
    println(lines)
  }

  def wordCount(filePath: String):Unit = {
    wordCount=0
    val source = Source.fromFile(filePath)
    val lines = source.getLines().toList
    for(line<-lines){
      val words = line.split("\\s+").map(_.toLowerCase)
      for(word<-words){
        wordCount+=1
      }
    }
    println(s"Wordcount is : ${wordCount}")
  }

  def lineCount(filePath: String): Unit = {
    val source = Source.fromFile(filePath)
    val lines = source.getLines().toList
    println(f"Total lines: ${lines.length}")
  }

  def characterCount(filePath: String): Unit = {
    charCount=0
    val source = Source.fromFile(filePath)
    val lines = source.getLines().toList
    for(line<-lines){
      val words = line.split("\\s+").map(_.toLowerCase)
      for(word<-words){
        charCount+=word.length
      }
    }
    println(f"Total characters: ${charCount}")
  }

  def averageWordLength(filePath: String): Unit = {
    characterCount(filePath)
    wordCount(filePath)
    println("Average word length: ", charCount/wordCount)
  }

  def mostCommonStartingLetter(filePath: String): Unit = {
    val source = Source.fromFile(filePath)
    val lines = source.getLines().toList
    source.close()

    val words = lines.flatMap(_.split("\\s+")).map(_.toLowerCase)

    val startingLetters = words.map(_.head)
    val letterCounts = startingLetters.groupBy(identity).mapValues(_.size)

    println(letterCounts.maxByOption(_._2).map(x => (x._1, x._2)))
  }

  def wordOccurrences(filePath: String, mainWord: String): Unit = {
    val source = Source.fromFile(filePath)
    val lines = source.getLines().toList
    var wordOccured = 0

    val words = lines.flatMap(_.split("\\s+")).map(_.toLowerCase)
    for(word<-words){
      if(word==mainWord){
        wordOccured+=1
      }
    }

    println(s"${mainWord} occured in file $wordOccured times")
  }
}

object AssignmentTask5 {
  def main(args: Array[String]): Unit = {
    val filePath = "C:\\Users\\Administrator\\IdeaProjects\\temp\\src\\main\\scala\\temp.txt"
    val file = new FileAnalyzer()
    var flag = true
    println("1.LoadFile\n2.WordCount\n3.LineCount\n4.CharacterCount\n5.AverageWordLength\n6." +
      "MostCommonStaringLetter\n7.WordOccurance\n8.Exit")
    while(flag){
      print("Enter choice: ")
      val choice = readLine().toInt
      if(choice==1){
        file.loadFile(filePath)
      }else if(choice==2){
        file.wordCount(filePath)
      }else if(choice==3){
        file.lineCount(filePath)
      }else if(choice==4){
        file.characterCount(filePath)
      }else if(choice==5){
        file.averageWordLength(filePath)
      }else if(choice==6){
        file.mostCommonStartingLetter(filePath)
      }else if(choice==7){
        print("Enter word you want to check occurance: ")
        val word = readLine().toString
        file.wordOccurrences(filePath, word)
      }else if(choice==8){
        flag=false
      }else{
        println("wrong choice")
      }
    }
  }
}
