package Demo.niuke;




/**
 * Created by zhengjie on 2020/3/21.
 */
public class Solution {
    public int run(TreeNode root) {
           if(root==null) return 0;
           if(root.left==null){
               return run(root.right)+1;

           }
           if(root.right==null){
               return run(root.left)+1;
           }
           return Math.min(run(root.left)+1,run(root.right)+1);
    }

}
