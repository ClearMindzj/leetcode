package leetcode.heap;

/**
 * Created by zhengjie on 2020/1/15.
 */
public class Solution23 {


    public static void main(String[] args) {
        ListNode head=new ListNode(0);
        ListNode h=head;
        for (int i = 1; i <9 ; i++) {
            ListNode t=new ListNode(i);
            h.next=t;
            h=h.next;
        }
        for (int i = 0; i <9 ; i++) {
            System.out.println(head.val);
            head=head.next;
        }
    }

}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }