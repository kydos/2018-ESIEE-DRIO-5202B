package edu.esiee.scala18.ex1

class Square(val side: Float) extends Shape {

  def scale(a: Float): Shape = new Square(a * side)

  def show(): Unit = print(s"Square($side)")

  def area: Float = side*side
  def perimeter: Float = 4*side

}
