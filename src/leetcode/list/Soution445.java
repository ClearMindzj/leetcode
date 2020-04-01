package leetcode.list;

/**
 * Created by zhengjie on 2020/3/18.
 * 两数相加2
 */
public class Soution445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
           ListNode ll1= reverse(l1);
           ListNode ll2=reverse(l2);
        ListNode dummy=new ListNode(0);
        ListNode pre=dummy;
        int carry=0;
        while (ll1!=null||ll2!=null){
            int x=(ll1!=null)?ll1.val:0;
            int y=(ll2!=null)?ll2.val:0;
            int num=x+y+carry;
            //循环一次清空
            carry=0;
            if(num>=10){
                carry=num/10;
                num=num%10;
            }
            pre.next=new ListNode(num);
            pre=pre.next;
            if(ll1!=null)
                ll1=ll1.next;
            if(ll2!=null)
                ll2=ll2.next;
        }
        if(carry>0){
            pre.next=new ListNode(carry);
        }
       ListNode pre1=null;
       ListNode cur=dummy.next;
       ListNode next=dummy.next;
       while (cur!=null){
           next=cur.next;
           cur.next=pre1;
           pre1=cur;
           cur=next;
       }
       return pre1;


    }
    public ListNode  reverse(ListNode listNode){
        ListNode pre=null;
        ListNode cur=listNode;
        ListNode next=listNode;
        while (cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
}
