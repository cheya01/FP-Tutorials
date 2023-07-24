package FP_tutorials.FP_Tutorials_21002061.tutorial_5

object T5_question_4 extends App {
  def EvenOrOdd(n: Int): String = {
    if (n == 0) "Even"
    else if (n == 1) "Odd"
    else if (n < 0) EvenOrOdd(-n)
    else EvenOrOdd(n - 2)
  }

  println(EvenOrOdd(3))
  //println(EvenOrOdd(127))
}
