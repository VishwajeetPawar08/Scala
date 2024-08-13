import scala.io.Source

object FileAnalysis {
  def main(args: Array[String]): Unit = {
    val filePath = "C:\\Users\\Administrator\\IdeaProjects\\temp\\src\\main\\scala\\forFileAnalysis.txt"
    //read file from the path
    val source = Source.fromFile(filePath)
    //read all lines
    val lines = source.getLines().toList
    //println(lines)
    source.close()

    //count words
    val words = lines.flatMap(_.split("\\s+")).map(_.toLowerCase)
    //words.foreach(println)

    //1..............Get most frequent word count
    val groupedWord = words.groupBy(identity)
    val wordCount = groupedWord.mapValues(_.size).toSeq.sortBy(-_._2)
    //wordCount.take(10).foreach{case (word, count) => println(s"$word: $count")}

    //2.............Average word length
    val totalWords = words.length
    val totalChars = words.map(_.length).sum
    val avgWordLength = if (totalWords>0) totalChars.toDouble/totalWords else 0.0
    //println(avgWordLength)
    //print(avgWordLength%.2f)


  }

}
