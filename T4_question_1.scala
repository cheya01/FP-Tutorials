package FP_tutorials.FP_Tutorials_21002061

object T4_question_1 extends App {
  println("Enter the deposit amount: ")
  val dep = scala.io.StdIn.readDouble()

  var depInterest: Double = 0

  println("The interest for the deposit is Rs." + calcInterest(dep))

  def calcInterest(dep: Double): Double = {
    if (dep <= 20000) {
      depInterest = dep * 0.02
      return depInterest
    } else if (dep <= 200000) {
      depInterest = dep * 0.04
      return depInterest
    } else if (dep <= 2000000) {
      depInterest = dep * 0.035
      return depInterest
    } else {
      depInterest = dep * 0.065
      return depInterest
    }

  }
}