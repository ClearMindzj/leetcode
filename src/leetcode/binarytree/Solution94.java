package leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengjie on 2020/2/22.
 */
public class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        getAns(root, ans);
        return ans;
    }

    private void getAns(TreeNode root, List<Integer> ans) {
        if(root==null){
            return;
        }
        getAns(root.left,ans);
        ans.add(root.val);
        getAns(root.right,ans);
    }


}

