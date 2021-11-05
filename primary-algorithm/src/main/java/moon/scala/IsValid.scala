package moon.scala



class IsValid {
  def isValid(s:String):Boolean={
    if(s.length%2==1){
      false
    }else if(s==""){
      true
    }else{
      var i=0
      while(i<s.length-1){
        var n=0
        var boo=true
        s(i) match {
          case '(' =>
            while(boo){
              if(!(s(i+2*n+1)==')')){
                n+=1
                if(2*n+1+i>s.length-1){
                  return false
                }
              }else{
                boo=false
              }
            }
          case '[' =>
            while(boo){
              if(!(s(i+2*n+1)==']')){
                n+=1
                if(2*n+1+i>s.length-1){
                  return false
                }
              }else{
                boo=false
              }
            }
          case '{' =>
            while(boo){
              if(!(s(i+2*n+1)=='}')){
                n+=1
                if(2*n+1+i>s.length-1){
                  return false
                }
              }else{
                boo=false
              }
            }
          case ')' =>
            while(boo){
              if(!(s(i-2*n+1)=='(')){
                n+=1
                if(i-2*n+1<0){
                  return false
                }
              }else{
                boo=false
              }
            }
          case ']' =>
            while(boo){
              if(!(s(i-2*n+1)=='[')){
                n+=1
                if(i-2*n+1<0){
                  return false
                }
              }else{
                boo=false
              }
            }
          case '}' =>
            while(boo){
              if(!(s(i-2*n+1)=='{')){
                n+=1
                if(i-2*n+1<0){
                  return false
                }
              }else{
                boo=false
              }
            }
          case _=> return false
        }
        i+=1
      }
      true
    }
  }
  //更好的解决方案
  def isValidB(s:String):Boolean={
    val stack=scala.collection.mutable.Stack[Char]()
    for(i<-s.indices){
        s(i) match {
          case '('=>stack.push('(')
          case '['=>stack.push('[')
          case '{'=>stack.push('{')
          case ')'=>if(stack.isEmpty||(!(stack.top=='('))){
            return false
          }else{
            stack.pop()
          }
          case ']'=>if(stack.isEmpty||(!(stack.top=='['))){
            return false
          }else{
            stack.pop()
          }
          case '}'=>if(stack.isEmpty||(!(stack.top=='{'))){
            return false
          }else{
            stack.pop()
          }
          case _=>false
        }
    }
    if(stack.isEmpty)true else false
  }
}
