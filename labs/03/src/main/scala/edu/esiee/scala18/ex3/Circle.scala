package edu.esiee.scala18.ex3

import edu.esiee.scala18.ex2.Shape

class Circle(val radius: Float) extends Shape {
  def scale(a: Float): Shape = new Circle(a * radius)

  def show(): Unit = print(s"Circle($radius)")

  lazy val area: Float = Math.PI.toFloat*radius*radius
  lazy val perimeter: Float = 2*Math.PI.toFloat*radius
}
