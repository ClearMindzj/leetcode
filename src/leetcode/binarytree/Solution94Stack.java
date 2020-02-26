package leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by zhengjie on 2020/2/25.
 * 中序遍历栈
 */
public class Solution94Stack {
    public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> list=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode cur=root;
        while (cur!=null||!stack.isEmpty()){
        while (cur!=null){
            stack.push(cur);
            cur=cur.left;
        }
        cur=stack.pop();
        list.add(cur.val);
        cur=cur.right;
        }
        return list;
    }
}
