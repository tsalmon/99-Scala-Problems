package org.p99.scala

import org.scalatest._

class P06Spec extends UnitSpec {

  "isPalindrome" should "true of List(1, 2, 3, 2, 1)" in {
      val myList = List(1, 2, 3, 2, 1)
      assert(P06.isPalindrome(myList) == true)
  }
}
