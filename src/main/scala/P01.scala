package org.p99.scala

object P01 {

	def last(l: List[Any]) : Any = 
		l match {
			case head::Nil =>  head
			case head::tails =>  last(tails)
			case _ => Nil
		}
	

	def main(args: Array[String]): Unit = {
		println(last(List("1", 2, "3", '4')));	  
	}
}
