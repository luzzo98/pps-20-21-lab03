package Exercise

import u03.Lists.List
import u03.Lists.List._
import u02.Modules.Person
import u02.Modules.Person._
import Exercise1._

object Exercise3 {

//  val onlyOneRecursionOfFlatMap = Cons(Nil(),Nil())
//
//  def coursesOfTeachers(l: List[Person]): List[String] = flatMap(onlyOneRecursionOfFlatMap)(l match {
//    case Cons(Teacher(_, course), t) => _ => Cons(course, coursesOfTeachers(t))
//    case Cons(Student(_,_), t) => _ => coursesOfTeachers(t)
//    case Nil() => _ => Nil()
//  })

  def coursesOfTeachers(l: List[Person]): List[String] = l match {
    case Cons(Teacher(_, course), t) => Cons(course, coursesOfTeachers(t))
    case Cons(Student(_, _), t) => coursesOfTeachers(t)
    case Nil() => Nil()
  }
}
