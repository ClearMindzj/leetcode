package leetcode.all;

/**
 * Created by zhengjie on 2020/6/9.
 */
public class Solution32dp最长有效括号 {
    public static void main(String[] args) {
        Solution32dp最长有效括号 solution32=new Solution32dp最长有效括号();
        String s=")(((((()())()()))()(()))(";
        System.out.println(solution32.longestValidParentheses(s));
    }
    //dp法1
    public int longestValidParentheses(String s) {
        int max=0;
        int[] dp=new int[s.length()+1];
        for (int i = 2; i <=s.length() ; i++) {
            if(s.charAt(i-1)==')') {
                //前面一个对应左括号
                if (s.charAt(i - 2) == '(') {
                    dp[i] = dp[i - 2] + 2;
                }
                //右括号前面是右括号，并且除去前面的合法序列的前面是左括号
            else if (i - dp[i - 1]-1 > 0 && s.charAt(i - dp[i - 1] - 2)== '(') {
                    dp[i] = dp[i - 1] + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
                }
                max = Math.max(max, dp[i]);
            }
        }
        return max;
    }

    //dp法2
    public int longestValidParentheses2(String s) {
        int maxans = 0;
        int dp[] = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                //右括号前边是左括号
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                    //右括号前边是右括号，并且除去前边的合法序列的前边是左括号
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
                }
                maxans = Math.max(maxans, dp[i]);
            }
        }
        return maxans;
    }

}
