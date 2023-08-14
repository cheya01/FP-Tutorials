package FP_tutorials.FP_Tutorials_21002061.tutorial_7

object T7_question_01 {
  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(num => num % 2 == 0)
  }

  def main(args: Array[String]): Unit = {
    val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    val evenNumbers = filterEvenNumbers(input)
    println(evenNumbers)
  }

}
