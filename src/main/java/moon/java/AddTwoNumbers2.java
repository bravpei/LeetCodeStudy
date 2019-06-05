package moon.java;

public class AddTwoNumbers2 {
    public static class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
  }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l=new ListNode(0),l3,l0;
        l0=l;
        int a=0;
        while(l1!=null||l2!=null){
//            System.out.println(++b);
            l3=new ListNode(0);
            if(l1!=null&&l2!=null) {
                l3.val = (a + l1.val + l2.val) % 10;
                a = (a + l1.val + l2.val) / 10;
                l1=l1.next;
                l2=l2.next;
            }else if(l1!=null){
                l3.val = (l1.val+a)%10;
                a=(l1.val+a)/10;
                l1=l1.next;
            }else{
                l3.val=(l2.val+a)%10;
                a=(l2.val+a)/10;
                l2=l2.next;
            }
            l.next=l3;
            l=l.next;
        }
        if(a==1) l.next=new ListNode(1);
        return l0.next;
    }
    public static void main(String[] args){
        ListNode l1=new ListNode(9);
        l1.next=new ListNode(9);

        ListNode l2=new ListNode(1);

        ListNode l3=addTwoNumbers(l1,l2);
        while(l3!=null){
            System.out.println(l3.val);
            l3=l3.next;
        }
    }
}
