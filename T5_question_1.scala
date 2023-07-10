package FP_tutorials.FP_Tutorials_21002061

object T5_question_1 {
  def isPrime(n: Int): Boolean = {
    def isPrimeUtil(n: Int, i: Int): Boolean = {
      if (n <= 2)
        return n == 2

      if (n % i == 0)
        return false

      if (i * i > n)
        return true

      isPrimeUtil(n, i + 1)
    }

    isPrimeUtil(n, 2)
  }

}
