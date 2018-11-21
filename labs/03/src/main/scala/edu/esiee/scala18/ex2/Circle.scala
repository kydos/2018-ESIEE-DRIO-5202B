package edu.esiee.scala18.ex2

class Circle(val radius: Float) extends Shape {

  def scale(a: Float): Shape = new Circle(a * radius)

  def show(): Unit = print(s"Circle($radius)")

  val area: Float = Math.PI.toFloat*radius*radius
  val perimeter: Float = 2*Math.PI.toFloat*radius
}
