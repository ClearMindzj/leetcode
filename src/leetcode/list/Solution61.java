package leetcode.list;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by zhengjie on 2020/3/9.
 * 旋转链表
 */
public class Solution61 {
    public static void main(String[] args) {
        Solution61 solution61=new Solution61();
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        System.out.println(solution61.rotateRight(head,2));
    }
    public ListNode rotateRight(ListNode head, int k) {
         if(head==null||k==0){
             return head;
         }
         int len=0;
         ListNode h=head;
         ListNode tail=null;
         while (h!=null){
             len++;
             h=h.next;
             if(h!=null){
                 tail=h;
             }
         }
         int n=k%len;
         if(n==0){
             return head;
         }
         //利用快慢指针找出第n+1个节点
         ListNode fast=head;
         ListNode slow=head;
         for (int i=0;i<=n;i++){
             fast=fast.next;
         }
         while (fast!=null){
             fast=fast.next;
             slow=slow.next;
         }
         //尾节点指向头节点
         tail.next=head;
         head=slow.next;
         slow.next=null;
         return head;

    }

}
