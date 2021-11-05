package moon.scala

class RemoveElement {
  def removeElement(nums:Array[Int],`val`:Int):Int={
    if(nums.length==0){
      return 0
    }
    var i=0
    for(j<-nums.indices){
      if(nums(j)!=`val`){
        nums(i)=nums(j)
        i+=1
      }
    }
    i
  }
}
