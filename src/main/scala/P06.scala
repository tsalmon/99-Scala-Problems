package org.p99.scala

object P06 {

  def isPalindrome(list:List[Any]) : Boolean = {
    for(i <- 0 to list.size/2){
      if(list(i) != list(list.size - 1 - i)){
        return false
      }
    }
    return true
  }
}
