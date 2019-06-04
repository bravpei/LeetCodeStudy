package moon.scala

class RemoveDuplicates {
  def removeDuplicates(nums:Array[Int]):Int={
    if(nums.length==0){
      return 0
    }
    var i=0
    for(j<-nums.indices){
      if(nums(i)!=nums(j)){
        i+=1
        nums(i)=nums(j)
      }
    }
    i+1
  }
}
