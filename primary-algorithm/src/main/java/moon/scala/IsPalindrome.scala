package moon.scala

class IsPalindrome {
  def isPalindrome(x:Int):Boolean={
    if(x>=0&&x<=9){
      true
    }
    else if(x>10){
      val a=0
      val divisor:Int=a match {
        case _ if x/1000000000>0=>1000000000
        case _ if x/100000000>0=>100000000
        case _ if x/10000000>0=>10000000
        case _ if x/1000000>0=>1000000
        case _ if x/100000>0=>100000
        case _ if x/10000>0=>10000
        case _ if x/1000>0=>1000
        case _ if x/100>0=>100
        case _ if x/10>0=>10
      }
      def loop(divA:Int,y:Int):Boolean={
        if(y/divA==y%10){
          if(divA<=10){
             true
          }else{
            loop(divA/100,(y-(y/divA)*divA)/10)
          }
        }else{
          false
        }
      }
      loop(divisor,x)
    }else{
      false
    }
  }
  //更好的实现
  def isPalindromeB(x:Int):Boolean={
    if(x<0){
      false
    }else if(x<10){
      true
    }else if(x%10==0){
      false
    }
    else{
      var a=0
      var b=x
      while(a*10<=b/10){
        a=a*10+b%10
        b=b/10
      }
      a==b||a==b/10
    }
  }
}
