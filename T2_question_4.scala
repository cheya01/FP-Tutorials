package FP_tutorials.FP_Tutorials_21002061
object T2_question_4 extends App {
  def calculateAttendance(price: Double): Int = {
    if (price == 15.0) {
      120
    } else if (price < 15.0) {
      (120 + ((15.0 - price) / 5.0) * 20.0).toInt
    } else {
      (120 - ((price - 15.0) / 5.0) * 20.0).toInt
    }
  }

  def calculateProfit(price: Double): Double = {
    val attendance = calculateAttendance(price)
    val cost = 500 + attendance * 3
    val revenue = price * attendance
    val profit = revenue - cost
    profit
  }

  def findBestTicketPrice(): Double = {
    val ticketPrices = Range.inclusive(1, 100, 1)
    val profits = ticketPrices.map(x => calculateProfit(x))
    val maxProfit = profits.max
    val bestPriceIndex = profits.indexOf(maxProfit)
    ticketPrices(bestPriceIndex)
  }

  val bestPrice = findBestTicketPrice()
  println(s"The best ticket price for maximum profit is Rs $bestPrice")


}
