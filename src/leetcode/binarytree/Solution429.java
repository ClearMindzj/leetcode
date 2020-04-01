package leetcode.binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by zhengjie on 2020/3/21.
 * N叉数层次遍历
 */
public class Solution429 {
        public List<List<Integer>> levelOrder(Node root) {
            Queue<Node> queue=new ArrayDeque<>();
            List<List<Integer>> lists=new ArrayList<>();
            if(root==null){
                return lists;
            }
            queue.add(root);
            int size=0;
            while (!queue.isEmpty()){
                size=queue.size();
                List<Integer> list=new ArrayList<>();
                for (int i = 0; i <size ; i++) {
                    Node node=queue.poll();
                    list.add(node.val);
                   for(Node node1:node.children){
                       if(node1!=null){
                           queue.add(node1);
                       }
                   }
                }
                lists.add(new ArrayList<>(list));
            }
            return lists;
        }
}
