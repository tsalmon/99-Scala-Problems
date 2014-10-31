package org.p99.scala

import org.scalatest._

class P03Spec extends UnitSpec {

  "nth" should "return the kth element of list Any " in {
    val myList = List(12, 24, 36, 48, 50)
    assert(P03.nth(myList, 2) == 36)
  }

  "nth" should "return throw exception to get 2nd element of empty list" in {
    val myList = List()
    intercept[IndexOutOfBoundsException] {
      P03.nth(myList, 2)
    }
  }

}
