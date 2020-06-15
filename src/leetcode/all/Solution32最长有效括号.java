package leetcode.all;

/**
 * Created by zhengjie on 2020/6/9.
 */
public class Solution32最长有效括号 {

    public static void main(String[] args) {
        Solution32最长有效括号 solution32=new Solution32最长有效括号();
        String s="(()";
        System.out.println(solution32.longestValidParentheses(s));
    }
    public int longestValidParentheses(String s) {
       int count;
       int max=0;
        for (int i = 0; i <s.length() ; i++) {
            count=0;
            for (int j = i; j <s.length() ; j++) {
                if(s.charAt(j)=='('){
                    count++;
                }else {
                    count--;
                }
                if(count<0){
                    break;
                }
                if(count==0){
                    max=Math.max(max,j-i+1);
                }

            }
        }
        return max;
    }
}
