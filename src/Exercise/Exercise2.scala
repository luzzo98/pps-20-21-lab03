package Exercise

import u03.Lists.List
import u03.Lists.List._
import u02.Optionals.Option
import u02.Optionals.Option._

import scala.annotation.tailrec

object Exercise2 {

  def max(l: List[Int]): Option[Int] = {
    @tailrec
    def _max(l: List[Int], n: Int): Option[Int] = l match {
      case Cons(h, t) => if (h > n) _max(t, h) else _max(t, n)
      case Nil() => Some(n)
    }

    l match {
      case Cons(h, t) => _max(t, h)
      case Nil() => None() //without this case "max(Nil())" would return an error
    }
  }
}
