package FP_tutorials.FP-Tutorials

object T3_question_1 extends App {
  def reverseString(input: String): String = {
    if (input.isEmpty)
      ""
    else
      reverseString(input.tail) + input.head
  }
  val inputString = "Hello, World!"
  println(inputString)
  val reversedString = reverseString(inputString)
  println(reversedString)
}
