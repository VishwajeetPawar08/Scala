import scala.io.Source
import scala.io.StdIn.readLine

object AssignmentTask4 {
  def main(args: Array[String]): Unit = {
    val filePath = "C:\\Users\\Administrator\\IdeaProjects\\temp\\src\\main\\scala\\temp.txt"
    println("Enter number of words you want to display: ")
    val N = readLine().toInt
    var wordCount1 = wordCount(filePath, N)
    wordCount1.take(N).foreach{case (word, count) => println(s"$word: $count")}
  }

  def wordCount(filePath: String, N: Int): List[(String, Int)] = {
    val source = Source.fromFile(filePath)
    val lines = source.getLines().toList
    source.close()

    val words = lines.flatMap(_.split("\\s+")).map(_.toLowerCase)

    val groupedWord = words.groupBy(identity)
    val wordCount = groupedWord.mapValues(_.size).toList.sortBy(-_._2).take(N)
    wordCount
  }
}
