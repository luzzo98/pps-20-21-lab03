package TestExercise

import Exercise.Lists.List._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class TestExercise1 {

  val lst = Cons(10, Cons(20, Cons(30, Nil())))

  @Test def testDrop(){
    assertEquals(Cons(20, Cons(30, Nil())), drop(lst, 1))
    assertEquals(Cons(30, Nil()), drop(lst, 2))
    assertEquals(Nil(), drop(lst, 5))
  }
}
