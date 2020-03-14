package leetcode.list;

/**
 * Created by zhengjie on 2020/3/9.
 * 删除链表的倒数第N个节点
 */
public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode pre=new ListNode(0);
         pre.next=head;
        ListNode slow=pre;
        ListNode fast=pre;
        for (int i = 0; i <n ; i++) {
            fast=fast.next;
        }
        while (fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return  pre.next;
    }
}
