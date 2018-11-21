package edu.esiee.scala18.ex1

class Circle(val radius: Float) extends Shape {

  def scale(a: Float): Shape = new Circle(a * radius)

  def show(): Unit = print(s"Circle($radius)")

  def area: Float = Math.PI.toFloat*radius*radius
  def perimeter: Float = 2*Math.PI.toFloat*radius
}

