package FP_tutorials.FP_Tutorials_21002061.tutorial_9
class Account(initialBalance: Double) {
  private var balance: Double = initialBalance

  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      balance += amount
      println(s"Deposited $amount. New balance: $balance")
    } else {
      println("Invalid deposit amount")
    }
  }

  def withdraw(amount: Double): Unit = {
    if (amount > 0 && amount <= balance) {
      balance -= amount
      println(s"Withdrew $amount. New balance: $balance")
    } else {
      println("Invalid withdrawal amount or insufficient balance")
    }
  }

  def transfer(amount: Double, targetAccount: Account): Unit = {
    if (amount > 0 && amount <= balance) {
      balance -= amount
      targetAccount.deposit(amount)
      println(s"Transferred $amount to target account. New balance: $balance")
    } else {
      println("Invalid transfer amount or insufficient balance")
    }
  }

  def getBalance: Double = balance
}

object T9_question_3 {
  def main(args: Array[String]): Unit = {
    val account1 = new Account(1000)
    val account2 = new Account(500)

    println(s"Account 1 balance: ${account1.getBalance}")
    println(s"Account 2 balance: ${account2.getBalance}")

    account1.deposit(200)
    account2.withdraw(100)
    account1.transfer(300, account2)

    println(s"Account 1 balance: ${account1.getBalance}")
    println(s"Account 2 balance: ${account2.getBalance}")
  }
}

