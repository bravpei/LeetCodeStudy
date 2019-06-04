package moon.scala

class IsAnagram {
  def isAnagram(s:String,t:String):Boolean={
    if(s.sorted==t.sorted){
      true
    }else false
  }
}
