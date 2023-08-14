package FP_tutorials.FP_Tutorials_21002061.tutorial_8

object T8_question_01 {
  def calculateInterest: Double => Double = {depositAmount => depositAmount match {
        case amount if amount <= 20000 => amount * 0.02
        case amount if amount <= 200000 => amount * 0.04
        case amount if amount <= 2000000 => amount * 0.035
        case amount => amount * 0.065
      }
  }
    def main(args: Array[String]): Unit = {
      val depositAmount = 250000.0 // Example deposit amount
      val interest = calculateInterest(depositAmount)
      println(s"The interest earned on Rs. $depositAmount is Rs. $interest")
    }


}
