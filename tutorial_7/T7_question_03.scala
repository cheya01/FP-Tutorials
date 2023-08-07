package FP_tutorials.FP_Tutorials_21002061.tutorial_7

object T7_question_03 {

  def isPrime(num: Int): Boolean = {
    if (num <= 1) false
    else if (num == 2) true
    else !(2 to Math.sqrt(num).toInt).exists(x => num % x == 0)
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(isPrime)
  }

  def main(args: Array[String]): Unit = {
    val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val primeNumbers = filterPrime(input)
    println(primeNumbers)
  }

}
