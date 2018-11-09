package edu.esiee.scala18
// import edu.esiee.scala18._  
object Complex {
  def apply(re: Double, im: Double) = new Complex(re, im)
}

class Complex(val re: Double, val im: Double) {
  def + (b: Complex) = Complex(this.re + b.re, this.im + b.im)

  def sum (b: Complex) = Complex(this.re + b.re, this.im + b.im)

  override def toString = s"$re+i$im"
}
