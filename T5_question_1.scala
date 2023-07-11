package FP_tutorials.FP_Tutorials_21002061
object T5_question_1 extends App {

  def IfPrime(n: Int, divisor: Int = 2): Boolean = {
    if (n <= 1)
      false
    else if (divisor == n)
      true
    else if (n % divisor == 0)
      false
    else
      IfPrime(n, divisor + 1)
  }


  print("Enter a number to check if it is a prime number: ")
  var num = scala.io.StdIn.readInt()
  println(IfPrime(num))
}
