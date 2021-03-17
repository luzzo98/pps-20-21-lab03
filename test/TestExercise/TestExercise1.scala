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
    assertEquals(Nil(), drop(Nil(), 5)) //test with nil()
  }

  @Test def testFlatMap(): Unit = {
    assertEquals(Cons(11, Cons(21, Cons(31, Nil()))), flatMap(lst)(v => Cons(v+1, Nil())))
    assertEquals(
      Cons(11, Cons(12, Cons(21, Cons(22, Cons(31, Cons(32, Nil())))))),
      flatMap(lst)(v => Cons(v+1, Cons(v+2,Nil()))) //append the next to each element
    )
    assertEquals(Nil(), flatMap(Nil[Int]())(v => Cons(v+1, Nil())))  //test with nil()
  }

  @Test def testMap2(): Unit = {
    assertEquals(Cons(12, Cons(22, Cons(32, Nil()))), myMap(lst)(_+2))
    assertEquals(Cons(20, Cons(40, Cons(60, Nil()))), myMap(lst)(_*2))
    assertEquals(Nil(), myMap(Nil[Int]())(_*2)) //test with nil()
  }

  @Test def testFilter2(): Unit = {
    assertEquals(Cons(20, Cons(30, Nil())), filter(lst)(_ >= 20))
    assertEquals(Cons(10, Nil()), filter(lst)(_ < 20))
    assertEquals(Nil(), filter(Nil[Int]())(_ < 20)) //test with nil()
  }
}
