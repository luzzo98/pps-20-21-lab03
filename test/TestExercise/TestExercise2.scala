package TestExercise

import u03.Lists.List._
import u02.Optionals.Option._
import Exercise.Exercise2._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class TestExercise2 {

  @Test def testMax(): Unit = {
    assertEquals(Some(25), max(Cons(10, Cons(25, Cons(20, Nil())))))
    assertEquals(Some(20), max(Cons(-5, Cons(0, Cons(20, Cons(20, Cons(10, Nil())))))))
    assertEquals(Some(-5), max(Cons(-5,Nil()))) //test with only one element
    assertEquals(None(), max(Nil())) //test with nil()
  }

  @Test def testMaxWithTailRec(): Unit = {
    assertEquals(Some(25), maxWithTailRec(Cons(10, Cons(25, Cons(20, Nil())))))
    assertEquals(Some(20), maxWithTailRec(Cons(-5, Cons(0, Cons(20, Cons(20, Cons(10, Nil())))))))
    assertEquals(Some(-5), maxWithTailRec(Cons(-5,Nil()))) //test with only one element
    assertEquals(None(), maxWithTailRec(Nil())) //test with nil()
  }
}
