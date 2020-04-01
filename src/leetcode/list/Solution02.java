package leetcode.list;

/**
 * Created by zhengjie on 2020/3/18.
 * 两数相加
 */
public class Solution02 {
    public static void main(String[] args) {
        ListNode head=new ListNode(2);
        head.next=new ListNode(4);
        head.next.next=new ListNode(3);
        ListNode head1=new ListNode(5);
        head1.next=new ListNode(6);
        head1.next.next=new ListNode(4);
        Solution02 solution02=new Solution02();
        System.out.println(solution02.addTwoNumbers(head,head1));

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode pre=dummy;
        int carry=0;
        while (l1!=null||l2!=null){
            int x=(l1!=null)?l1.val:0;
            int y=(l2!=null)?l2.val:0;
            int num=x+y+carry;

            carry=0;
            if(num>=10){
                carry=num/10;
                num=num%10;
            }
            pre.next=new ListNode(num);
            pre=pre.next;
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
        }
        if(carry>0){
            pre.next=new ListNode(carry);
        }
        return dummy.next;

    }

}
