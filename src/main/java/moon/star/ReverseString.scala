package moon.star

import scala.collection.mutable.ListBuffer

class ReverseString {
  def reverseString(s:String):String={
    val str=new StringBuffer()
    var length=s.length-1
    while(length>=0){
      str.append(s(length).toString)
      length-=1
    }
    str.toString
  }
}
