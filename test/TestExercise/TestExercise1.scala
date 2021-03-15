package TestExercise

import u03.Lists.List._
import Exercise.Exercise1._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class TestExercise1 {

  val lst = Cons(10, Cons(20, Cons(30, Nil())))

  @Test def testDrop(): Unit = {
    assertEquals(Cons(20, Cons(30, Nil())), drop(lst, 1))
    assertEquals(Cons(30, Nil()), drop(lst, 2))
    assertEquals(Nil(), drop(lst, 5))
  }

  @Test def testFlatMap(): Unit = {
    assertEquals(Cons(11, Cons(21, Cons(31, Nil()))), flatMap(lst)(v => Cons(v+1, Nil())))
    assertEquals(Cons(11, Cons(12, Cons(21, Cons(22, Cons(31, Cons(32, Nil())))))), flatMap(lst)(v => Cons(v+1, Cons(v+2,Nil()))))
  }

  @Test def testMap2(): Unit = {
    assertEquals(Cons(12, Cons(22, Cons(32, Nil()))), map2(lst)(_+2))
    assertEquals(Cons(20, Cons(40, Cons(60, Nil()))), map2(lst)(_*2))
  }

  @Test def testFilter2(): Unit = {
    assertEquals(Cons(20, Cons(30, Nil())), filter[Int](lst)(_ >= 20))
    assertEquals(Cons(10, Nil()), filter[Int](lst)(_ < 20))
  }
}
