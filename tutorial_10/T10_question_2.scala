package FP_tutorials.FP_Tutorials_21002061.tutorial_10

object T10_question_2 {

  def countLetterOccurrences(words: List[String]): Int = {
    val wordLengths = words.map(_.length)
    val totalLetterCount = wordLengths.reduce((count1, count2) => count1 + count2)
    return totalLetterCount
  }

  def main(args: Array[String]): Unit = {
    val inputWords = List("apple", "banana", "cherry", "date")
    val totalLetterCount = countLetterOccurrences(inputWords)
    println(s"Total letter occurrences: $totalLetterCount")
  }

}
