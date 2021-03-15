package Exercise

import u03.Lists.List
import u03.Lists.List._
import scala.annotation.tailrec

object Exercise1 {

  @tailrec
  def drop[A](l: List[A], n: Int): List[A] = l match {
    case Cons(_, t) => if (n>0) drop(t,n-1) else l
    case Nil() => Nil()
  }

  def flatMap[A,B](l: List[A])(f: A => List[B]): List[B] = l match {
    case Cons(h, t) => append(f(h), flatMap(t)(f))
    case Nil() =>Nil()
  }

  def myMap[A,B](l: List[A])(mapper: A=>B): List[B] = flatMap(l)(v => Cons(mapper(v), Nil()))

  def myFilter[A](l: List[A])(pred: A=>Boolean): List[A] = flatMap(l) {
    case v if pred(v) => Cons(v, Nil())
    case _ => Nil()
  }
}
