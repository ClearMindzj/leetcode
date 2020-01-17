package leetcode.heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by zhengjie on 2020/1/15.
 *先全部放入一个链表，然后排序取出。
 */
public class Solution23 {


    public static void main(String[] args) {
        ListNode head=new ListNode(0);
        ListNode h=head;
        for (int i = 1; i <9 ; i++) {
            ListNode t=new ListNode(i);
            h.next=t;
            h=h.next;
        }
        for (int i = 0; i <9 ; i++) {
            System.out.println(head.val);
            head=head.next;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> l = new ArrayList<Integer>();
        //存到数组
        for (ListNode ln : lists) {
            while (ln != null) {
                l.add(ln.val);
                ln = ln.next;
            }
        }
        //数组排序
        Collections.sort(l);
        //存到链表
        ListNode head = new ListNode(0);
        ListNode h = head;
        for (int i : l) {
            ListNode t = new ListNode(i);
            h.next = t;
            h = h.next;
        }
        h.next = null;
        return head.next;
    }

}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }