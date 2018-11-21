import edu.esiee.scala18.ex4._

val t = Node(Leaf(1), Node(Node(Leaf(2), Leaf(3)), Leaf(4)))
val t2 = Node(Leaf(1), Node(Empty, Empty))

Tree.height(t)

Tree.sum(t)

Tree.sum(t2)

Tree.fold(0)((a, b) => a + b)(t)

Tree.fold(0)(_ + _ )(t2)

Tree.fold(1)(_ * _ )(Node(Leaf(1), Empty))

Tree.fold(1)(_ * _ )(t)


val xs = (2 to 100000).toList

def primes(n: Int, xs: List[Int]): List[Int] = n match {
  case 1 => List(xs.head)
  case _ => {
    xs match {
      case y::ys =>
        y::primes(n-1, ys.filter(_ % y != 0))
      case e @ List(y) => e
      case List() => List()
    }
  }
}

primes(500, xs)



