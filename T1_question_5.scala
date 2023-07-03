package FP_tutorials.FP-Tutorials

object T1_question_5 extends App {
  def timeCalculator: Double = {
    val easy_pace = 8
    val tempo_pace = 7
    val time = 2*easy_pace + 3*tempo_pace + 2*easy_pace
    return time
  }
  println(timeCalculator)
}
