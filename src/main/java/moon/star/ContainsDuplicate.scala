package moon.star

class ContainsDuplicate {
  def containsDuplicate(nums:Array[Int]):Boolean={
    var a=0
    for(i<-nums.indices){
      a=0
      for(j<-i until nums.length){
        if(nums(i)==nums(j)){
          a+=1
        }
        if(a>1){
          return true
        }
      }
    }
    false
  }
}
