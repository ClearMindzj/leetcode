package leetcode.list;

/**
 * Created by zhengjie on 2020/3/18.
 * 环形链表
 */
public class Solution141 {
    public boolean hasCycle(ListNode head) {
      ListNode slow=head;
      ListNode fast=head;
      while ((fast!=null)){
          if(fast.next==null){
              return false;
          }
          slow=slow.next;
          fast=fast.next.next;
          if(slow==fast){
              return true;
          }
      }
      return false;
    }
}
