package FP_tutorials.FP_Tutorials_21002061.tutorial_10

object T10_question_1 {

  def calculateAverage(temperatures: List[Int]): Double = {
    val fahrenheitTemps = temperatures.map(celsius => (celsius * 9 / 5) + 32)
    val totalFahrenheit = fahrenheitTemps.reduce((temp1, temp2) => temp1 + temp2)
    val averageFahrenheit = totalFahrenheit / temperatures.length.toDouble
    return averageFahrenheit
  }

  def main(args: Array[String]): Unit = {
    val inputTemperatures = List(0, 10, 20, 30)
    val averageFahrenheit = calculateAverage(inputTemperatures)
    println(s"Average Fahrenheit temperature: $averageFahrenheit")
  }

}
