package FP_tutorials

object T1_question_2 extends App {
  def CtoF_tempConverter(t: Double): Double = {
    var far = t * 1.8000 + 32.00
    return far
  }
  println(CtoF_tempConverter(35))
}
