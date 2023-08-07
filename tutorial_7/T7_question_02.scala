package FP_tutorials.FP_Tutorials_21002061.tutorial_7

object T7_question_02 {

  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(num => num * num)
  }

  def main(args: Array[String]): Unit = {
    val input = List(1, 2, 3, 4, 5)
    val squaredNumbers = calculateSquare(input)
    println(squaredNumbers)
  }

}
