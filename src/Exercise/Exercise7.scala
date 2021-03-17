package Exercise

import u03.Streams.Stream
import u03.Streams.Stream._
import scala.annotation.tailrec

object Exercise7 {

  def fibs(): Stream[Int]= {
    def _fib (temp1: Int, temp2: Int): Stream[Int] = {
      cons(temp1, _fib(temp2, temp1+temp2))
    }
    _fib(0,1)
  }
}
