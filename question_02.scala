package FP.tutorial_2

object question_02 extends App {

  // initialization
  var a: Int=2
  var b: Int=3
  var c: Int=4
  var d: Int=5
  var k:Float=4.3f
  val g: Float = 4f

  // (a)
  b-=1
  println((b*a)+(c*d))
  d-=1

  // (b)
  println(a)
  a+=1

  // (c)
  println(-2*(g-k)+c)

  // (d)
  println(s"c=$c")
  c+=1

  // (e)
  c+=1
  val x = c*a
  println(s"c=$x")
  a+=1



}
