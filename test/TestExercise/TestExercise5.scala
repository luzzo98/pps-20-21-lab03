package TestExercise

import u03.Lists.List._
import Exercise.Exercise5._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class TestExercise5 {

  val s = Stream.take(Stream.iterate(0)(_+1))(10)
  val short = Stream.take(Stream.iterate(0)(_+1))(2)


  @Test def testDrop(): Unit = {
    assertEquals(Cons(6, Cons(7, Cons(8, Cons(9, Nil())))), Stream.toList(Stream.drop(s)(6)))
    assertEquals(Stream.toList(s), Stream.toList(Stream.drop(s)(0))) //with 0 "drop" returned the entire stream
    assertEquals(Stream.empty(), Stream.drop(short)(5)) //if the stream is shorter than "n" an Empty() is returned
    assertEquals(Nil(), Stream.toList(Stream.drop(Stream.empty())(5))) //if the stream is an Empty(), another Empty() is returned
  }
}
