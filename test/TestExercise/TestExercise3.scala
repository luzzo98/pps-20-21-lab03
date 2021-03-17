package TestExercise

import u03.Lists.List._
import u02.Modules.Person
import u02.Modules.Person._
import Exercise.Exercise3._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class TestExercise3 {

  val l = Cons[Person](Teacher("Ugo", "Fisica"), Cons(Student("Alex", 2015), Cons(Teacher("Franco", "Analisi"), Nil())))

  @Test def testCoursesOfTeachers(): Unit = {
    assertEquals(Cons("Fisica", Cons("Analisi", Nil())), coursesOfTeachers(l))
    assertEquals(Nil(), coursesOfTeachers(Cons(Student("Alex", 2015), Nil()))) //test with no Teacher()
    assertEquals(Nil(), coursesOfTeachers(Nil())) //test with Nil()
  }
}
