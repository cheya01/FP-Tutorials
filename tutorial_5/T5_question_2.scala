package FP_tutorials.FP_Tutorials_21002061.tutorial_5

object T5_question_2 extends App {
  def primeSeq(n: Int): Unit = {
    //function to check whether prime
    def isPrime(num: Int, i: Int): Boolean = {
      if (num <= 2)
        return num == 2

      if (num % i == 0)
        return false

      if (i * i > num)
        return true

      isPrime(num, i + 1)
    }
//function to print a single prime number
    def printPrimes(num: Int): Unit = {
      if (num <= 1)
        return 1

      printPrimes(num - 1)

      if (isPrime(num, 2))
        print(s"$num ")
    }

    printPrimes(n - 1)
  }
  primeSeq(5)
}


