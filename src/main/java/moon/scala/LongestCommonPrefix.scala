package moon.scala

class LongestCommonPrefix {
  def longestCommonPrefix(strs:Array[String]): String ={
    var i=0
    var str=""
    try{
      while(true){
        for(j<-0 until strs.length-1){
          if(strs(j)(i)!=strs(j+1)(i)){
            return str
          }
        }
        str+=strs(0)(i)
        i+=1
      }
      str
    }catch {
      case _:Exception=>str
    }

  }
}
