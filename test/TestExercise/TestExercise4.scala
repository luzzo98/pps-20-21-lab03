package TestExercise

import u03.Lists.List._
import Exercise.Exercise4._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class TestExercise4 {

  val lst = Cons(3, Cons(7, Cons(1, Cons(5, Nil()))))
  val lst2 = Cons(-5, Cons(5, Cons(2, Cons(4, Nil()))))

  @Test def testFoldLeft(): Unit = {
    assertEquals(-16, foldLeft(lst)(0)(_-_))
    assertEquals(-10, foldLeft(lst2)(2)(_-2*_))
  }

  @Test def testRevers(): Unit = {
    assertEquals(Cons(5, Cons(1, Cons(7, Cons(3, Nil())))), reverse(lst))
    assertEquals(Cons(4, Cons(2, Cons(5, Cons(-5, Nil())))), reverse(lst2))
    assertEquals(Cons(true, Cons(false, Cons(false, Nil()))), reverse(Cons(false, Cons(false, Cons(true, Nil())))))
    assertEquals(Nil(), reverse(Nil())) //test with Nil()
  }

  @Test def testFoldRight(): Unit = {
    assertEquals(-8, foldRight(lst)(0)(_-_))
    assertEquals(-7, foldRight(lst2)(2)(_-2*_))
  }

  @Test def testFoldWithDifferentType(): Unit = {
    def ifTrueIncrement(a: Boolean, b: Int): Int = if (a) b+1 else b

    assertEquals(2, foldRight(Cons(true, Cons( false, Cons(true, Nil()))))(0)(ifTrueIncrement))
    //you have to switch the parameter in "ifTrueIncrement" to test "foldLeft"
    assertEquals(2, foldLeft(Cons(true, Cons( false, Cons(true, Nil()))))(0)((a,b) => ifTrueIncrement(b,a)))
  }
}
