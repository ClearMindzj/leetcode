package leetcode.heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by zhengjie on 2020/1/16.
 * 使用优先队列
 */
public class Solution23Method3 {
    public static void main(String[] args) {
        ListNode head1=new ListNode(3);
        head1.next=new ListNode(4);
        head1.next.next=new ListNode(5);

        ListNode head2=new ListNode(1);
        head2.next=new ListNode(3);
        head2.next.next=new ListNode(4);

        ListNode head3=new ListNode(2);
        head3.next=new ListNode(6);
        ListNode[] lists={head1,head2,head3};
         mergeKLists(lists);



    }
    public static ListNode mergeKLists(ListNode[] lists) {
        //定义优先队列的比较器
        Comparator<ListNode> cmp=new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                // TODO Auto-generated method stub
                return o1.val-o2.val;
            }
        };

        //建立队列
        Queue<ListNode> q = new PriorityQueue<ListNode>(cmp);
        for(ListNode l : lists){
            if(l!=null){
                q.add(l);
            }
        }
        ListNode head = new ListNode(0);
        ListNode point = head;
        while(!q.isEmpty()){
            //出队列
            point.next = q.poll();
            point = point.next;
            //判断当前链表是否为空，不为空就将新元素入队
            ListNode next = point.next;
            if(next!=null){
                q.add(next);
            }
        }
            while (head.next!=null){
                head=head.next;
                System.out.print(head.val+" ");
            }
        return head.next;
    }
}
