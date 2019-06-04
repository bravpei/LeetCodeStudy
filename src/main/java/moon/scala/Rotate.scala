package moon.scala

class Rotate {
  def rotate(nums:Array[Int],k:Int):Array[Int]={
    for(j<-0 until k){
      var a=0
      var b=0
      var x=nums(0)
      var y=0
      for(i<-nums.indices){
        if(a+1<nums.length){
          y=nums(a+1)
          nums(a+1)=x
          x=y
          a=a+1
        }else{
          y=nums(1-nums.length+a)
          nums(1-nums.length+a)=x
          x=y
          a=1-nums.length+a-1
        }
      }
    }
    nums
  }
}
