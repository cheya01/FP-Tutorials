package FP_tutorials.FP_Tutorials_21002061

object T2_question_3 extends App {
  val normal_rate = 250
  val OT_rate = 85
  val tax = 0.12

  def sal_cal(nh: Double, OTh: Double):Double = {
    val gross_sal = nh*normal_rate + OTh*OT_rate
    val net_sal = gross_sal - (gross_sal*tax)
    printf("take home salary of an employee from %f working hours and %f OT hours is ",nh, OTh)
    return net_sal
  }
  println(sal_cal(40,30))
}
