package FP.tutorial_2

object T2_question_1 extends App {
  //Declaring the variables and assigning with the initial values
  val k,i,j: Int = 2
  val m,n: Int = 5
  val f: Float = 12f
  val g: Float = 4f
  val c: Char = 'X'

  //evaluating expressions
  val a = k + 12*m
  val b = m/j
  val x = n%j
  val d = m / j * j
  val e = f + 10*5 + g
  var y = i
  y += 1
  y = y*n

  //printing the initial values
  println(s"k = $k")
  println(s"i = $i")
  println(s"j = $j")
  println(s"m = $m")
  println(s"n = $n")
  println(s"f = $f")
  println(s"g = $g")
  println(s"c = $c")

  printf("\n")
  //printing the evaluated values
  printf("k + 12 * m =  %d\n", a)
  printf("m / j = %d\n", b)
  printf("n %% j= %d\n", x)
  printf("m / j * j = %d\n", d)
  printf("f + 10*5 +g = %f\n", e)
  printf("++i * n = %d\n", y)
}
