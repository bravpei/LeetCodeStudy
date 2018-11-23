package moon.star

class QuiklySort {
  def partition(a: Array[Int],lo:Int,li:Int):Int={
    val v=a(lo)
    var i=lo+1
    var j=li
    while(i<j){
      while(a(i)<=v&&i<j){
        i+=1
      }
      while(a(j)>=v&&i<j){
        j-=1
      }
      val b=a(i)
      a(i)=a(j)
      a(j)=b
    }
    if(a(j)>v){
      j-=1
    }
    val c=a(j)
    a(j)=a(lo)
    a(lo)=c
    j
  }
  def sort(a:Array[Int],lo:Int,li:Int):Array[Int]={
    if(lo>=li) return a
    var j=partition(a,lo,li)
    sort(a,lo,j-1)
    sort(a,j+1,li)
  }
  def quiklySort(a:Array[Int]):Array[Int]={
      sort(a,0,a.length-1)
  }
}
