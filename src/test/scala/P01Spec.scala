package org.p99.scala

import org.scalatest._

class P01Spec extends FlatSpec {

	"last" should "return the head of 5xint list " in {
    	val myList = List(12, 24, 36, 48, 50)
			assert(P01.last(myList) == 50)
  	}

	"last" should "return the head of empty list " in {
    	val myList = List()
		assert(P01.last(myList) == Nil)
  	}

	"last" should "return the head of unique item list " in {
    	val myList = List("azerty")
		assert(P01.last(myList) == "azerty");
  	}

}
