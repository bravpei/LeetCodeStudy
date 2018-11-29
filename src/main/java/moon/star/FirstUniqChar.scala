package moon.star

class FirstUniqChar {
    def firstUniqChar(s:String):Int={
      var set=scala.collection.mutable.Set[Char]()
      for(i<-s.indices){
        if(!set.contains(s(i))){
          var j=i+1
          while(j<s.length&&s(i)!=s(j)){
            j+=1
          }
          if(j>=s.length)return i
          else set.+=(s(i))
        }
      }
      -1
    }
}
