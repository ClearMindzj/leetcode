package commonsuanfa.lru;

import java.util.HashMap;

/**
 * Created by zhengjie on 2020/3/2.
 */
 class Node {
    public int key, val;
    public Node prev, next;
    //头结点，避免空


    public Node(int k, int v) {
        this.key = k;
        this.val = v;
    }
}
    class DoubleList{
        Node head;
        //尾节点
        Node tail;
        //在链表头部增加节点
        public DoubleList(){
            head=new Node(0,0);
            tail=new Node(0,0);
            head.next=tail;
        }
        public void addFirst(Node x){
             if(head.next==x) return;
             Node temp=head.next;
             head.next=x;
             x.next=temp;
             x.prev=head;
             temp.prev=x;
        }
        //删除链表中x节点
        public void remove(Node x){
          if(x==null) return;
          x.prev.next=x.next;
          x.next.prev=x.prev;
        }
        //删除链表中最后一个节点，并返回该节点
        public Node removeLast(){
           Node last=tail.prev;
           last.prev.next=tail;
           tail.prev=last.prev;
           return last;
        }


    }

public class LRUCache{
    private HashMap<Integer,Node> map;

    private DoubleList cache;


    //最大容量
    private  int cap;
    //当前容量
    private  int size=0;

    public LRUCache(int cap,DoubleList cache,HashMap<Integer,Node> map){
        this.cap=cap;
        this.map=map;
        this.cache=cache;
    }

    public int get(int key){
        if(!map.containsKey(key)){
            return -1;
        }
        int val=map.get(key).key;
        put(key,val);
        return val;
    }
    public void put(int key,int val){
        //先把新节点做出来
        Node x=new Node(key,val);
        if(map.containsKey(key)){
            //旧的节点删除
            Node old=map.get(key);
            cache.remove(old);
            cache.addFirst(x);
            map.put(key,x);
        }else {
            if(cap==size){
                //删除最后一个数据
                Node last=cache.removeLast();
                size--;
                map.remove(last.key);
            }
            //直接添加到头部
            cache.addFirst(x);
            size++;
            map.put(key,x);
        }
    }
}
class Test{
    public static void main(String[] args) {
        DoubleList cache=new DoubleList();
        HashMap<Integer,Node> map=new HashMap<>();
        LRUCache lruCache=new LRUCache(3,cache,map);
        lruCache.put(1,1);
        lruCache.put(2,2);
        lruCache.put(3,3);
        lruCache.get(1);
        lruCache.put(4,4);
    while (cache.head!=null){
        System.out.println(cache.head.val);
        cache.head=cache.head.next;
    }

    }
}