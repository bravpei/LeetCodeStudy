package moon.scala

import scala.collection.mutable.ArrayBuffer

class Intersect {
  def intersect(nums1:Array[Int],nums2:Array[Int]):Array[Int]={
   var map=Map[Int,Int]()
    var arr=ArrayBuffer[Int]()
    for(i<-nums1.indices){
      if(map.isDefinedAt(nums1(i))){
        map.+=(nums1(i)->(map(nums1(i))+1))
      }else{
        map.+=(nums1(i)->1)
      }
    }
    for(i<-nums2.indices){
      if(map.isDefinedAt(nums2(i))){
        if(map(nums2(i))>0){
          arr.+=(nums2(i))
          map.+=(nums2(i)->(map(nums2(i))-1))
        }
      }
    }
    arr.toArray
  }
}
