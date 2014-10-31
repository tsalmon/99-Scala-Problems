package org.p99.scala

object P03 {
  def nth(l: List[Any], k: Int) : Any = {
    if(k == 0){
      l match {
        case Nil => Nil
        case head::tail => head
      }
    } else {
        l match {
          case Nil => throw new IndexOutOfBoundsException("Exception thrown")
          case head::tail => nth(tail, k-1)
        }
    }
  }
}
