package leetcode.list;

/**
 * Created by zhengjie on 2020/3/10.
 * 反转从位置m到n的链表
 */
public class Solution92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
          if(m==1){
              return reverseN(head,n);
          }
          head.next=reverseBetween(head.next,m-1,n-1);
          return head;
    }

    public ListNode reverseN(ListNode head,int n){
        if(n==1){
           return  head;
        }
        //以head.next为起点，需要反转前n-1个节点
        ListNode last=reverseN(head.next,n-1);
        ListNode successor=head.next.next;
        head.next.next=head;
        //让反转之后的head节点和后面的接起来
        head.next=successor;
        return  last;
    }
}
