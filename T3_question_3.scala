package FP_tutorials.FP_Tutorials_21002061

object T3_question_3 extends App {
  def calculateMean(num1: Int, num2: Int): Double = {
    val mean = (num1 + num2) / 2.toDouble
    BigDecimal(mean).setScale(2, BigDecimal.RoundingMode.HALF_UP).toFloat
  }

  val num1 = 3
  val num2 = 2
  val mean = calculateMean(num1, num2).toFloat
  printf("mean is %.2f",mean)

}
