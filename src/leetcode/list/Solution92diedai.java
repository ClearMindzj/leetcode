package leetcode.list;

/**
 * Created by zhengjie on 2020/3/10.
 */
public class Solution92diedai {
    public ListNode reverseBetween(ListNode head, int m, int n) {
         if(m==n) return head;
         ListNode dummy=new ListNode(0);
         dummy.next=head;
         ListNode pre =dummy;
         //left1,left2记录两端的断点;
         ListNode left1=null;
         ListNode left2=null;
        for (int i = 1; i <m ; i++) {
          pre=pre.next;
        }
          left1=pre;
          head=pre.next;
          left2=head;
          //pre从第m个节点开始，翻转链表
          pre=pre.next;
          head=head.next;
        for (int i = m+1; i <n ; i++) {
            ListNode temp=head.next;
            head.next=pre;
            pre=head;
            head=temp;
        }
        left2.next=head.next;
        left1.next=head;
        head.next=pre;
        return  dummy.next;
    }
}
