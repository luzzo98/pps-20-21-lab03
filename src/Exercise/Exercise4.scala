package Exercise

import u03.Lists.List
import u03.Lists.List._
import scala.annotation.tailrec

object Exercise4 {

  @tailrec
  def foldLeft[A,B](list: List[A])(initialValue: B)(f: (B,A) => B): B = list match {
    case Cons(h, t) => t match {
      case Cons(_, _) => foldLeft(t)(f(initialValue, h))(f)
      case Nil() => f(initialValue, h)
    }
  }

//  def foldRight[A,B](list: List[A])(initialValue: B)(f: (A,B) => B): B = {
//    @tailrec
//    def _foldRight(l: List[A])(initialValue: B)(f: (A,B) => B): B = l match {
//      case Cons(h, t) => t match {
//        case Cons(_, _) => _foldRight(t)(f(h, initialValue))(f)
//        case Nil() => f(h, initialValue)
//      }
//    }
//    _foldRight(reverse(list))(initialValue)(f)
//  }

  //optimized version of "foldRight()"
  def foldRight[A,B](list: List[A])(initialValue: B)(f: (A,B) => B): B = foldLeft(reverse(list))(initialValue)((a,b) => f(b,a))

  def reverse[A](list: List[A]): List[A] = list match {
    case Cons(h, t) => t match {
      case Cons(_, _) => append(reverse(t), Cons(h, Nil()))
      case Nil() => Cons(h, Nil())
    }
    case Nil() => Nil() //without this case "reverse(Nil())" would return an error
  }
}
