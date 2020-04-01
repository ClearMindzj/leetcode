package leetcode.list;

/**
 * Created by zhengjie on 2020/3/17.
 * 排序链表
 */
public class Solution148 {
    public static void main(String[] args) {
        Solution148 solution148=new Solution148();
        ListNode head=new ListNode(4);
        head.next=new ListNode(2);
        head.next.next=new ListNode(1);
        head.next.next.next=new ListNode(3);
        System.out.println(solution148.sortList(head));
    }
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode pre=new ListNode(0);
        pre.next=head;
        ListNode slow=pre;
        ListNode fast=pre;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=slow.next;
        slow.next=null;
        head=sortList(head);
        head2=sortList(head2);
        ListNode result=merge(head,head2);
        return result;


    }
    public ListNode merge(ListNode head1,ListNode head2){
        ListNode pre=new ListNode(0);
        ListNode l3=pre;
        while (head1!=null&&head2!=null){
            if(head1.val>head2.val){
                l3.next=head2;
                l3=l3.next;
                head2=head2.next;
            }else {
                l3.next=head1;
                l3=l3.next;
                head1=head1.next;
            }
        }
        if (head1!=null){
            l3.next=head1;
        }
        if (head2!=null){
            l3.next=head2;
        }
        return pre.next;
    }
}
