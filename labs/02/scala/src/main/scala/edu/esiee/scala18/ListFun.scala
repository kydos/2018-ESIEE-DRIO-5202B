package edu.esiee.scala18

object ListFun {
  def sum(xs: List[Int]): Int = xs match {
    case y::ys => y + sum(ys)
    case List() => 0
  }


  def sum2(xs: List[Int]): Int = xs.foldLeft(0)(_ + _)

  def sum3(xs: List[Int]): Int = xs.foldLeft(0)(_ + _)

  val xs = "angelo".toList
  xs

  def reverse(s: String): String = s match {
    case "" => ""

  }

}
