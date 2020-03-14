package leetcode.list;

/**
 * Created by zhengjie on 2020/3/9.
 * 删除排序链表中重复元素
 */
public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode slow=head;
        ListNode fast=head.next;
        while (fast!=null){
            if(slow.val!=fast.val){
               slow.next=fast;
               slow=fast;
            }
            fast=fast.next;
        }
        slow.next=null;
        return head;
    }

}
