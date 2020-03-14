package leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengjie on 2020/2/25.
 * 二叉树所有路径
 */
public class Solution257 {
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> list=new ArrayList();
        strAdd(list,root,"");
        return list;
    }
    public void strAdd(List<String> list,TreeNode root,String str){//list.add
        if(root==null)
            return;
        str+=String.valueOf(root.val);//返回String类型的root.val的值
        if(root.left==null&&root.right==null) list.add(str);
        if(root.left!=null)  strAdd(list,root.left,str+"->");// 是void类型，不需要写return。
        if(root.right!=null) strAdd(list,root.right,str+"->");

    }


    public static void main(String[] args) {
        TreeNode b1=new TreeNode(1);
        b1.left=new TreeNode(2);
        b1.right=new TreeNode(3);
        Solution257 solution257=new Solution257();
          List<String> list=new ArrayList<>();
        list=solution257.binaryTreePaths(b1);
        for(String s:list){
            System.out.println(s);
        }
    }
}
