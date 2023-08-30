//package FP_tutorials.FP_Tutorials_21002061.tutorial_9

class Account(initialBalance: Double) {
  private var balance: Double = initialBalance

  def applyInterest(): Unit = {
    if (balance > 0) {
      balance += balance * 0.05
    } else {
      balance += balance * 0.1
    }
  }

  def getBalance: Double = balance
}

class Bank(val accounts: List[Account]) {
  def accountsWithNegativeBalances: List[Account] = {
    accounts.filter(account => account.getBalance < 0)
  }

  def sumOfAllBalances: Double = {
    accounts.map(_.getBalance).sum
  }

  def applyInterestToAllAccounts(): Unit = {
    accounts.foreach(_.applyInterest())
  }
}

object T9_question_4 {
  def main(args: Array[String]): Unit = {
    val account1 = new Account(100)
    val account2 = new Account(-200)
    val account3 = new Account(500)

    val bank = new Bank(List(account1, account2, account3))

    println("Accounts with negative balances:")
    bank.accountsWithNegativeBalances.foreach(account => println(s"${account.getBalance}"))

    val totalBalance = bank.sumOfAllBalances
    println(s"Total balance of all accounts: $totalBalance")

    println("Balances after applying interest:")
    bank.applyInterestToAllAccounts()
    bank.accounts.foreach(account => println(s"${account.getBalance}"))
  }
}
