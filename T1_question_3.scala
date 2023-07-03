package FP_tutorials.FP-Tutorials

object T1_question_3 extends App {
  def volumeCalculator(r: Double): Double = {
    var volume = 4/3 * (3.14*r*r*r)
    return volume
  }

  println(volumeCalculator(5))
}
