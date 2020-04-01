package leetcode.list;

import java.util.List;

/**
 * Created by zhengjie on 2020/3/20.
 * 重排链表
 */
public class Solution143 {
    public void reorderList(ListNode head) {
        if(head==null||head.next==null||head.next.next==null){
            return;
        }
        ListNode slow=head;
        ListNode fast=head;
        while (fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //链表右半部分头部
        ListNode right=slow.next;
        slow.next=null;
        //右半部分倒置
        ListNode rightHead=reverse(right);
        //见缝插进去
        while (rightHead!=null){
            ListNode temp=rightHead.next;
            rightHead.next=head.next;
            head.next=rightHead;
            head=rightHead.next;
            rightHead=temp;
        }

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
