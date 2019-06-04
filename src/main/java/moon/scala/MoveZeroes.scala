package moon.scala

class MoveZeroes {
  def moveZeroes(nums:Array[Int]):Array[Int]={
    var i=0
    var j=0
    while(j<nums.length&&i<nums.length){
      while(j<nums.length&&nums(j)==0){
        j+=1
      }
      while(i<nums.length&&nums(i)!=0){
        i+=1
      }
      if(i<nums.length&&j<nums.length){
        if(nums(j)!=0&&nums(i)==0&&j>i){
          val a=nums(i)
          nums(i)=nums(j)
          nums(j)=a
        }else j=i
      }
    }
    nums
  }
}
