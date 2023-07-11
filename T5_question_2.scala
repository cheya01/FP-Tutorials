package FP_tutorials.FP_Tutorials_21002061

object T5_question_2 extends App {
  def primeSeq(n: Int): Unit = {
    def isPrime(num: Int, i: Int): Boolean = {
      if (num <= 2)
        return num == 2

      if (num % i == 0)
        return false

      if (i * i > num)
        return true

      isPrime(num, i + 1)
    }

    def printPrimes(num: Int): Unit = {
      if (num <= 1)
        return

      printPrimes(num - 1)

      if (isPrime(num, 2))
        print(s"$num ")
    }

    printPrimes(n - 1)
  }
  primeSeq(10)
}


