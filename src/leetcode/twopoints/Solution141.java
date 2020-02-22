package leetcode.twopoints;

/**
 * Created by zhengjie on 2020/2/22.
 */
public class Solution141 {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)   return false;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null){
            if(fast.next==null){
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }

}
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
