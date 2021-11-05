package moon.scala

class ListNode(var _x:Int=0){
  var x:Int=_x
  var next:ListNode=_
}
class MergeTwoLists {
  def mergeTwoLists(l1:ListNode,l2:ListNode): ListNode ={
    val head=l1
    var lx:ListNode=null
    var ly:ListNode=null
    def loop(la:ListNode,lb:ListNode,tail:ListNode): Unit ={
      lx=la.next
      ly=lb.next
      tail.next=la
      la.next=lb
      if(lx!=AnyRef){
        loop(lx,ly,lb)
      }
    }
    loop(l1,l2,head)
    head
  }
}
