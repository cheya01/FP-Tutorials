package FP_tutorials.FP_Tutorials_21002061.tutorial_5

object T5_question_6 extends App {
  def fibonacci(n: Int): Int = n match {
    case 0 => 0
    case x if x == 1 => 1
    case _ => fibonacci(n - 1) + fibonacci(n - 2)
  }

  def fibonacciSeq(n: Int): Unit = {
    if (n > 0) fibonacciSeq(n - 1)
    println(fibonacci(n))
  }

  fibonacciSeq(10)
}
