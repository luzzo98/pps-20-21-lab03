package Exercise

import u03.Lists.List
import u03.Lists.List._
import scala.annotation.tailrec

object Exercise4 {

  @tailrec
  def foldLeft[A,B <: A](list: List[A])(initialValue: A)(f: (A,A) => B): B = list match {
    case Cons(h, t) => t match {
      case Cons(_, _) => foldLeft(t)(f(initialValue, h))(f)
      case Nil() => f(initialValue, h)
    }
  }

  def foldRight[A,B <: A](list: List[A])(initialValue: A)(f: (A,A) => B): B = {
    @tailrec
    def _foldRight(l: List[A])(initialValue: A)(f: (A,A) => B): B = l match {
      case Cons(h, t) => t match {
        case Cons(_, _) => _foldRight(t)(f(h, initialValue))(f)
        case Nil() => f(h, initialValue)
      }
    }
    _foldRight(reverse(list))(initialValue)(f)
  }

  def reverse[A](list: List[A]): List[A] = list match {
    case Cons(h, t) => t match {
      case Cons(_, _) => append(reverse(t), Cons(h, Nil()))
      case Nil() => Cons(h, Nil())
    }
  }
}
