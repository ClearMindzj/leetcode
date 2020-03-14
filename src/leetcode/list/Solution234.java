package leetcode.list;

import leetcode.heap.Solution23;

/**
 * Created by zhengjie on 2020/3/10.
 * 回文链表
 */
public class Solution234 {
    public static void main(String[] args) {
        Solution234 solution234=new Solution234();
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(2);
        head.next.next.next=new ListNode(1);
        System.out.println(solution234.isPalindrome(head));
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow,fast;
        slow=head;
        fast=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null){
            slow=slow.next;
        }
        ListNode left=head;
        ListNode right=reverse(slow);
        while (right!=null){
            if(left.val!=right.val){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

    }
    public ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode cur=head;
        while (cur!=null){
            ListNode next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
}
