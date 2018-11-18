import scala.annotation.tailrec

// Note for simplicity I am not checking if n>=0
// Take #1
def factorial1(n: Int): Int =
  if (n == 0) 1 else n * factorial1(n-1)


factorial1(5)

def factorial2(n: Int): Int = n match {
  case 0 => 1
  case _  if n > 0 => n*factorial2(n-1)
}

factorial2(5)
factorial2(4)

factorial1(3)
factorial2(6)

def factorial3(n: Int): Int = {
  @tailrec
  def afact(a: Int, n: Int): Int =
    if (n == 0) a else afact(a * n, n - 1)

  afact(1, n)
}

factorial3(20)

val f = (x : Int, y: Int) => 2*x+3*y


val iadd = (a: Int, b: Int) => a + b
val isub = (a: Int, b: Int) => a - b

val i = iadd(1,2)

def cadd(a: Int)(b:Int): Int = a + b
cadd(1)(2)

def csub(a: Int)(b:Int): Int = a - b
val cinc = cadd(1)_
cinc (10)

val ibinOp	 = (op: (Int, Int) => Int, a: Int, b:Int) => op(a,b)

ibinOp(iadd, 1, 2)
ibinOp(isub, 1, 2)


def cbinOp(op: (Int, Int) => Int)(a: Int)(b:Int) = op(a,b)

val inc = cbinOp (iadd) (1) _

inc(1)




@tailrec
def loop(n: Int)(body: => Unit): Unit = {
  if (n > 0) {
    body
    loop(n-1)(body)
  }
}
loop(5) {
  println("Looping!")
}

val xs = List(1,2,3,4)

def sum(xs: List[Int]): Int = xs match {
  case y::ys => y+sum(ys)
  case List() => 0
}

def mul(xs: List[Int]): Int = xs match {
  case y::ys => y*mul(ys)
  case List() => 1
}

sum(xs)
mul(xs)

def frsum(xs: List[Int]): Int = xs.foldRight(0)(_ + _)
def flsum(xs: List[Int]): Int = xs.foldLeft(0)(_ + _)

frsum(xs)
flsum(xs)

def reverse(xs: List[Int]): List[Int] = xs match {
  case List() => List()
  case y::ys => reverse(ys) ::: List(y)
}



val ys = reverse(xs)

val zs = ys.foldLeft(List[Int]())((xs: List[Int], x: Int) => x :: xs)

val ks = zs.foldRight(List[Int]())((x: Int, xs: List[Int]) => xs ::: List(x) )



