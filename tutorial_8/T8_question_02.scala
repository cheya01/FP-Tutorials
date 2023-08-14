package FP_tutorials.FP_Tutorials_21002061.tutorial_8

object T8_question_02 {
    def main(args: Array[String]): Unit = {
      println("Please provide exactly one integer input.")
      val input = scala.io.StdIn.readLine().toInt
      val printMessage: Int => Unit = {
        case num if num <= 0 => println("Negative/Zero is input")
        case num if num % 2 == 0 => println("Even number is given")
        case num => println("Odd number is given")
      }

      printMessage(input)
    }

}
