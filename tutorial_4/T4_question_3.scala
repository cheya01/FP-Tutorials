package FP_tutorials.FP_Tutorials_21002061.tutorial_4

object T4_question_3 extends App {
  def toLower(name: String): String = {
    name.toLowerCase()
  }

  def toUpper(name: String): String = {
    name.toUpperCase()
  }

  def formatNames(name: String)(formatFunc: String => String): String = {
    formatFunc(name)
  }
  val name1 = "Benny"
  val name2 = "Niroshan"
  val name3 = "Saman"
  val name4 = "Kumara"

  val formattedName1 = formatNames(name1)(toUpper)
  val formattedName2 = formatNames(name2.substring(0, 2))(toUpper) + name2.substring(2)
  val formattedName3 = formatNames(name3)(toLower)
  val formattedName4 = formatNames(name4.substring(0, 1))(toUpper) + formatNames(name4.substring(1, 5))(toLower) + formatNames(name4.substring(5))(toUpper)

  println(formattedName1)
  println(formattedName2)
  println(formattedName3)
  println(formattedName4)
}
