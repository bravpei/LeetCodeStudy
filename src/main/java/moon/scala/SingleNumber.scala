package moon.scala

class SingleNumber {
def singleNumber(nums:Array[Int]):Int={
  var a=0
  for(i<-nums.indices){
    a=0
    for(j<-nums.indices){
      if(nums(i)==nums(j)){
        a+=1
      }
    }
    if(a==1){
      return nums(i)
    }
  }
   -1
}
}
