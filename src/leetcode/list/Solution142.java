package leetcode.list;

/**
 * Created by zhengjie on 2020/3/18.
 * 环形链表2
 */
public class Solution142 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while ((fast!=null)){
            if(fast.next==null){
                return null;
            }
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                while (head!=slow){
                    head=head.next;
                    slow=slow.next;
            }
                return head;
        }
    }
        return null;
    }

}
