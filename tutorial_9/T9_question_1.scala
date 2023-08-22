package FP_tutorials.FP_Tutorials_21002061.tutorial_9

object T9_question_1 {

  class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator cannot be zero")

    private val g = gcd(n.abs, d.abs)
    val numer: Int = n / g
    val denom: Int = d / g

    def this(n: Int) = this(n, 1) // Auxiliary constructor for whole numbers

    def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    def neg: Rational = new Rational(-numer, denom)

    override def toString: String = s"$numer/$denom"
  }

  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4)
    val negX = x.neg
    println(s"x = $x")
    println(s"-x = $negX")
  }
}
