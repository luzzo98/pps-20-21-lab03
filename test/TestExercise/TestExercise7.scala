package TestExercise

import u03.Lists.List._
import u03.Streams.Stream
import Exercise.Exercise7._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class TestExercise7 {

  val fibsOf8 = Cons(0, Cons(1, Cons(1, Cons(2, Cons(3, Cons(5, Cons(8, Cons(13, Nil()))))))))

  @Test def testFibs(): Unit = {
    assertEquals(fibsOf8, Stream.toList(Stream.take(fibs())(8)))
    assertEquals(Cons(0, Cons(1, Nil())), Stream.toList(Stream.take(fibs())(2)))
    assertEquals(Cons(0, Nil()), Stream.toList(Stream.take(fibs())(1)))
    assertEquals(Nil(), Stream.toList(Stream.take(fibs())(0)))
  }
}
