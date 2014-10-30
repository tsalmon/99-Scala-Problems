package org.p99.scala

import org.scalatest._

class P02Spec extends FlatSpec {

  "penultimate" should "return the last but one of a list" in {
    var test_list = List(1, 1, 2, 3, 5, 8)
    assert(P02.penultimate(test_list) == 5)
  }

  "penultimate" should "return Null of a singleton list" in {
    var test_list = List(1)
    assert(P02.penultimate(test_list) == Nil)
  }

  "penultimate" should "return Nil of a empty list" in {
    var test_list = List()
    assert(P02.penultimate(test_list) == Nil)
  }


}
