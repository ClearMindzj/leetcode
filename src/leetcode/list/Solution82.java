package leetcode.list;

/**
 * Created by zhengjie on 2020/3/9.
 * 出现重复，直接删除
 */
public class Solution82 {
    public static void main(String[] args) {
        Solution82 solution82=new Solution82();
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(3);
        head.next.next.next.next=new ListNode(4);
        head.next.next.next.next.next=new ListNode(4);
        head.next.next.next.next.next.next=new ListNode(5);
        System.out.println(solution82.deleteDuplicates(head));


    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
       ListNode pre=new ListNode(0);
       ListNode start=pre;
       pre.next=head;
       ListNode cur=head;
       while (cur!=null&&cur.next!=null){
           if(cur.val==cur.next.val){
               while (cur.next!=null&&cur.val==cur.next.val){
                   cur=cur.next;
               }
               pre.next=cur.next;
               cur=cur.next;
           }else {
               pre=cur;
               cur=cur.next;
           }
       }
       return start.next;
    }
}
