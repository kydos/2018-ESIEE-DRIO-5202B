package edu.esiee.scala18.ex4

object Tree {

  def height(t: Tree): Int =
    t match {
      case Empty => 0
      case Leaf(_) => 1
      case Node(left, right) => 1+ Math.max(height(left), height(right))
    }

  def sum(t: Tree): Int =
    t match {
      case Empty => 0
      case Leaf(v) => v
      case Node(l, r) => sum(l) + sum(r)
    }

  def fold(zero: Int)(f: (Int, Int) => Int)(t: Tree): Int = {
    t match {
      case Empty => zero
      case Leaf(v) => v
      case Node(l, r) => f(fold(zero)(f)(l), fold(zero)(f)(r))
    }

  }
}

abstract class Tree
object Empty extends Tree
case class Leaf(v: Int) extends Tree
case class Node(l: Tree, r: Tree) extends Tree

