package leetcode.binarytree;

import java.util.*;

/**
 * Created by zhengjie on 2020/2/27.
 * 二叉树层次遍历自底向上
 */
public class Solution107 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> lists=new LinkedList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){
            return lists;
        }
       queue.add(root);
        int levelNum=0;
        while (!queue.isEmpty()){
            levelNum=queue.size();
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i <levelNum ; i++) {
                TreeNode node=queue.poll();
                list.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }

            }
            lists.addFirst(list);

        }
        return lists;
    }
}
