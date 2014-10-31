package org.p99.scala

object P04 {
  def length(list: List[Any]): Int =
    list match {
      case Nil => 0
      case head::tail => 1 + length(tail)
    }
}
