package FP_tutorials.FP_Tutorials_21002061.tutorial_5

object T5_question_5 extends App {
  def sumOfEvens(n: Int): Int = {
    if (n <= 0) 0
    else if (n % 2 == 0)
        return n + sumOfEvens(n-2)
    else sumOfEvens(n-1)
  }

  //print("Enter a number: ")
  //var num = scala.io.StdIn.readInt()
  var num = 4
  println(sumOfEvens(num-1))
}
