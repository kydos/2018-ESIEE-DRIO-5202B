package edu.esiee.scala18.ex1

class Rectangle(val base: Float, val height: Float) extends Shape {

  def scale(a: Float): Shape = new Rectangle(a * base, a * height)

  def show(): Unit = print(s"Rectangle($base, $height)")

  def area: Float = base*height
  def perimeter: Float = 2*(base + height)
}
