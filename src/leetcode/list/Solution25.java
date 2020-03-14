package leetcode.list;

/**
 * Created by zhengjie on 2020/3/8.
 * K个一组翻转链表
 */
public class Solution25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null){
            return null;
        }
        ListNode a,b;
        a=head;
        b=head;
        for (int i = 0; i <k ; i++) {
            if(b==null) return head;
            b=b.next;
        }
        ListNode newHead=reverse(a,b);
        a.next=reverseKGroup(b,k);
        return newHead;

    }
    public ListNode reverse(ListNode a,ListNode b){
        ListNode pre,cur,next;
        pre=null;cur=a;next=a;
        while (cur!=b){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
}
