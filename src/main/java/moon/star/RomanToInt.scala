package moon.star

class RomanToInt {
  def romanToInt(s:String):Int={
    var i=0
    var total=0
    var num=0
    while(i<s.length){
      num=s(i) match {
        case 'I' if i+1<s.length&&s(i+1)=='V'=>i+=2;4
        case 'I' if i+1<s.length&&s(i+1)=='X'=>i+=2;9
        case 'I' =>i+=1;1
        case 'V' =>i+=1;5
        case 'X' if i+1<s.length&&s(i+1)=='L'=>i+=2;40
        case 'X' if i+1<s.length&&s(i+1)=='C'=>i+=2;90
        case 'X' =>i+=1;10
        case 'L' =>i+=1;50
        case 'C' if i+1<s.length&&s(i+1)=='D'=>i+=2;400
        case 'C' if i+1<s.length&&s(i+1)=='M'=>i+=2;900
        case 'C' =>i+=1;100
        case 'D' =>i+=1;500
        case 'M' =>i+=1;1000
      }
      total+=num
    }
    total
  }
}
