package org.p99.scala

import org.scalatest._

class P05Spec extends UnitSpec {

  "reverse" should "return (5,4,3,2,1) of list (1,2,3,4,5)"  in {
    val myList = List(1,2,3,4,5)
    val retList = P05.reverse(myList)
    for(i <- 0 to retList.size - 1){
      assert(retList(i) == myList(retList.size - 1 - i))
    }
  }

  "reverse" should "return List() of empty list"  in {
    val myList = List()
    val retList = P05.reverse(myList)
    assert(retList.size == 0)
  }
  
}
