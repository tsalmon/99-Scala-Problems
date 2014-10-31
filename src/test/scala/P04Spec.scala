package org.p99.scala

import org.scalatest._

class P04Spec extends UnitSpec {

  "length" should "return 5 of a list of 5 elements" in {
    val myList = List(1, 2, 4, 6, 6)
    assert(P04.length(myList) == 5);
  }

  "length" should "return 0 of an empty list" in {
    val myList = List()
    assert(P04.length(myList) == 0);
  }

  "length" should "return 5 of a list 5 of list 5 int" in {
    val myList = List(List(1, 2, 4, 6, 6),
                      List(1, 2, 4, 6, 6),
                      List(1, 2, 4, 6, 6),
                      List(1, 2, 4, 6, 6),
                      List(1, 2, 4, 6, 6))
    assert(P04.length(myList) == 5);
  }

}
