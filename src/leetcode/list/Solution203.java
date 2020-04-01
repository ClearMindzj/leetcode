package leetcode.list;

/**
 * Created by zhengjie on 2020/3/18.
 * 移除链表元素
 */
public class Solution203 {
    public static void main(String[] args) {
        Solution203 solution203=new Solution203();
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(6);
        head.next.next.next=new ListNode(3);
        head.next.next.next.next=new ListNode(4);
        head.next.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next.next=new ListNode(6);
        solution203.removeElements(head,6);

    }
    public ListNode removeElements(ListNode head, int val) {
          ListNode dummy=new ListNode(0);
          ListNode pre=dummy;
          pre.next=head;
          ListNode cur=head;
          while (cur!=null){
              if(cur.val==val){
                    pre.next=cur.next;
                    cur=cur.next;
              }else {
                  pre = pre.next;
                  cur = cur.next;
              }
          }
          return dummy.next;
    }
}
