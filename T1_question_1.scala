package FP_tutorials.FP-Tutorials

object T1_question_1 extends App{

  def areaCalculator(r: Double): Double = {
    var area = 3.14*r*r
    return area
  }
  println(areaCalculator(5))
}
