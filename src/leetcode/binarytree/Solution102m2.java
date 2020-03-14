package leetcode.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by zhengjie on 2020/2/26.
 * 二叉树层次遍历
 * 超时
 * 给定二叉树: [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]

 */
public class Solution102m2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> lists=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){
            return lists;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            //当前层的元素
            int size=queue.size();
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i <size ; i++) {
                TreeNode node=queue.poll();
                if(node!=null) {
                    list.add(node .val);
                    queue.add(node.left);
                    queue.add(node.right);
                }

            }
            if(list.size()>0)
            lists.add(list);

        }
        return lists;
    }


}
