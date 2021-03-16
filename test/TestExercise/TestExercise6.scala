package TestExercise

import u03.Lists.List._
import u03.Streams.Stream
import Exercise.Exercise6._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class TestExercise6 {

  @Test def testConstant() {
    assertEquals(Cons("x", Cons("x", Cons("x", Cons("x", Cons("x", Nil()))))), Stream.toList(Stream.take(constant("x"))(5)))
    assertEquals(Nil(), Stream.toList(Stream.take(constant("x"))(0)))
    assertEquals(Cons(2, Cons(2, Cons(2, Nil()))), Stream.toList(Stream.take(constant(2))(3)))
  }
}
