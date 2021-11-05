package moon.scala

class TwoSum {
  def twoSum(nums:Array[Int],target:Int):Array[Int]= {
    val list=nums.toList
    var a=0
    def loop(head:Int,tail:List[Int]):Array[Int]={
      if(tail.contains(target-head)){
        Array(a,a+tail.indexOf(target-head)+1)
      }else{
        a+=1
        if(tail.tail!=Nil)
        loop(tail.head,tail.tail)
        else
          throw new IllegalArgumentException("数组不满足条件")
      }
    }
    loop(list.head,list.tail)
  }
}
