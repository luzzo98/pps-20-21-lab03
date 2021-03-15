package TestExercise

import u03.Lists.List._
import u02.Optionals.Option._
import Exercise.Exercise2._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class TestExercise2 {

  @Test def testMax(): Unit = {
    assertEquals(Some(25), max(Cons(10, Cons(25, Cons(20, Nil())))))
    assertEquals(Some(20), max(Cons(-5, Cons(0, Cons(20, Nil())))))
    assertEquals(None(), max(Nil()))
  }
}
