package FP_tutorials.FP_Tutorials_21002061.tutorial_5

object T5_question_3 extends App {
  def PrintAddition(num: Int) : Int = {
    if(num==1) 1
    else num + PrintAddition(num-1)
  }
  println(PrintAddition(5))
}
