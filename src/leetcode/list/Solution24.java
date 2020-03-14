package leetcode.list;

/**
 * Created by zhengjie on 2020/3/9.
 * 两两交换链表中节点
 */
public class Solution24 {

    public ListNode swapPairs(ListNode head) {
       if(head==null||head.next==null){
           return  head;
       }
       ListNode n=head.next;
       head.next=swapPairs(head.next.next);
       n.next=head;
       return n;

    }

}
