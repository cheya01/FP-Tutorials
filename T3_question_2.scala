package FP_tutorials.FP_Tutorials_21002061

object T3_question_2 extends App {
  def filterStrings(input: List[String]): List[String] = {
    input.filter(_.length > 5)
  }
  val inputList = List("elephant", "bird", "tiger", "kiwi", "butterfly")
  val filteredList = filterStrings(inputList)
  println(filteredList)

}
