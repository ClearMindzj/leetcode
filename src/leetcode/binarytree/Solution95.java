package leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengjie on 2020/2/24.
 * 不同的二叉搜索树
 */
public class Solution95 {
    public static void main(String[] args) {
        List<TreeNode> ans = new ArrayList<TreeNode>();
        Solution95 s=new Solution95();
        ans=s.getAns(1,3);


    }
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> ans = new ArrayList<TreeNode>();
        if (n == 0) {
            return ans;
        }
        return getAns(1, n);
    }
    private List<TreeNode> getAns(int start, int end) {
        List<TreeNode> ans = new ArrayList<TreeNode>();
        if(start>end){
            ans.add(null);
            return  ans;
        }
        if(start==end){
            TreeNode root=new TreeNode(start);
            ans.add(root);
            return ans;
        }
        for (int i = start; i <=end ; i++) {
            //得到所有可能的左子树
            List<TreeNode> leftTreeNodes=getAns(start,i-1);
            //得到所有可能的右子数
            List<TreeNode> rightTreeNodes=getAns(i+1,end);
            for(TreeNode leftTree:leftTreeNodes){
                for(TreeNode rightTree:rightTreeNodes){
                    TreeNode root=new TreeNode(i);
                    root.left=leftTree;
                    root.right=rightTree;
                    ans.add(root);
                }
            }
        }
        return ans;
    }

    }
