package moon.star

class SearchInsert {
  def searchInsert(nums: Array[Int], target: Int):Int={
    for(i<-nums.indices){
      if(nums(i)>=target){
        return i
      }
    }
    nums.length
  }
}
