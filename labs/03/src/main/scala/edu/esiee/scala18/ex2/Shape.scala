package edu.esiee.scala18.ex2

abstract class Shape {
  def scale(a: Float): Shape

  def show(): Unit

  val area: Float
  val perimeter: Float

}
