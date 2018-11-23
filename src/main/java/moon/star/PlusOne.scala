package moon.star

import scala.collection.mutable.ArrayBuffer

class PlusOne {
  def plusOne(digits:Array[Int]):Array[Int]={
    def loop(arr:Array[Int],length:Int):Array[Int]={
      if(arr(length)<9){
        arr(length)=arr(length)+1
        arr
      }else{
        if(length==0){
          arr(length)=0
          (ArrayBuffer(1)++=arr).toArray
        }else{
        arr(length)=0
        loop(arr,length-1)
        }
      }
    }
    loop(digits,digits.length-1)
  }
}
