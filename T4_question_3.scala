package FP_tutorials.FP_Tutorials_21002061

object T4_question_3 extends App {
  def toUpper(name: String): String = {
    name.toUpperCase()
  }

  def toLower(name: String): String = {
    name.toLowerCase()
  }

  def formatNames(name: String)(formatFunc: String => String): String = {
    formatFunc(name)
  }

  val name1 = "Benny"
  val name2 = "Niroshan"
  val name3 = "Saman"
  val name4 = "Kumara"

  val formattedName1 = T4_question_3.formatNames(name1)(T4_question_3.toUpper)
  val formattedName2 = T4_question_3.formatNames(name2.substring(0, 2))(T4_question_3.toUpper) + name2.substring(2)
  val formattedName3 = T4_question_3.formatNames(name3)(T4_question_3.toLower)
  val formattedName4 = T4_question_3.formatNames(name4.substring(0, 1))(T4_question_3.toUpper) + T4_question_3.formatNames(name4.substring(1, 5))(T4_question_3.toLower) + T4_question_3.formatNames(name4.substring(5))(T4_question_3.toUpper)

  println(formattedName1)
  println(formattedName2)
  println(formattedName3)
  println(formattedName4)
}
