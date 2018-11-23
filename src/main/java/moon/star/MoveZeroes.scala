package moon.star

class MoveZeroes {
  def moveZeroes(nums:Array[Int]):Array[Int]={
    var i=0
    var j=0
    while(j<nums.length){
      while(j<nums.length&&nums(j)==0){
        j+=1
      }
      while(i<nums.length&&nums(i)!=0){
        i+=1
      }
      val a=nums(i)
      nums(i)=nums(j)
      nums(j)=a
    }
    nums
  }
}
