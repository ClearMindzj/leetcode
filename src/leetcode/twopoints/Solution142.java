package leetcode.twopoints;

/**
 * Created by zhengjie on 2020/2/22.
 */
public class Solution142 {
    public ListNode detectCycle(ListNode head) {
            ListNode slow=head;
            ListNode fast=head;
            ListNode meet=head;
            while (fast!=null){
                if(fast.next==null){
                    return null;
                }
                slow=slow.next;
                fast=fast.next.next;

                //开始相遇
                if(fast==slow){
                    while(meet!=slow){
                        meet=meet.next;
                        slow=slow.next;
                    }
                    return meet;
                }
            }
            return null;
    }
}
