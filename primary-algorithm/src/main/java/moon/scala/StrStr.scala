package moon.scala

class StrStr {
  def strStr(haystack: String, needle: String):Int={
    if(haystack.length<needle.length){
      return -1
    }else if(needle.length==0){
      return 0
    }else{
      for(i<-0 to haystack.length-needle.length){
        if(haystack(i)==needle(0)){
          var j=0
          while(j<needle.length&&haystack(i+j)==needle(j)){
            if(j==needle.length-1){
              return i
            }
            j+=1
          }
        }
      }
    }
    -1
  }
}
