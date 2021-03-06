package leetcode.list;

/**
 * Created by zhengjie on 2020/3/18.
 * 合并k个链表
 */
public class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
          return null;
        }
        if(lists.length==1){
            return lists[0];
        }
         return merge(lists,0,lists.length-1);

    }
    public ListNode merge(ListNode[] listNodes,int start,int end){
        if(start>=end){
            return listNodes[start];
        }
        int mid=(start+end)/2;
        //合并左半部分链表
        ListNode left=merge(listNodes,start,mid);
        ListNode right=merge(listNodes,mid+1,end);
        ListNode head=mergeList(left,right);
        return head;
    }
    public ListNode mergeList(ListNode l1,ListNode l2){
        ListNode head=new ListNode(0);
        ListNode l3=head;
        while (l1!=null&&l2!=null){
            if(l1.val>l2.val){
                l3.next=l2;
                l2=l2.next;
                l3=l3.next;
            }else {
                l3.next=l1;
                l1=l1.next;
                l3=l3.next;
            }
        }
        if(l1!=null){
            l3.next=l1;
        }
        if(l2!=null){
            l3.next=l2;
        }
        return head.next;
    }
}
