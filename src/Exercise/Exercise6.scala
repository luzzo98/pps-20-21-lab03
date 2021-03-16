package Exercise

import u03.Streams.Stream

object Exercise6 {

  def constant[A](a: A): Stream[A] = Stream.cons(a, constant(a))

}
