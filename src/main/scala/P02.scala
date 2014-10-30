package org.p99.scala

object P02 {
  def penultimate(l:List[Any]) : Any =
    l match {
      case last::Nil => Nil
      case head::last::Nil =>  head
      case head::tails =>  penultimate(tails)
      case _ => Nil
    }
}
