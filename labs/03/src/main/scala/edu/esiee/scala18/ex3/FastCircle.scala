package edu.esiee.scala18.ex3

class FastCircle(r: Float) extends Circle(r) {
  override lazy val perimeter: Float = Math.PI.toFloat * (radius.toInt << 1)

  override def show(): Unit = print(s"O($radius")
}
