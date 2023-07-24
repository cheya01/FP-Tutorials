package FP_tutorials.FP_Tutorials_21002061.tutorial_1

object T1_question_4 extends App {
  def costCalculator(n: Double): Double = {
    var purchasing_cost = 24.95*n*0.6
    var shipping_cost = {
      if(n>50) 3*50 + 0.75*(n-50)
      else 3*n
    }

    var total = purchasing_cost + shipping_cost
    return total
  }
  println(costCalculator(60))
}
