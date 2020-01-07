package leetcode;

/**
 * Created by zhengjie on 2019/12/21.
 */
public class Solution03 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("acbabc"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int len;
        if (s == null || (len = s.length()) == 0) return 0;
        int preP = 0, max = 0;
        int[] hash = new int[128];
        for (int i = 0; i < len; ++i) {
            char c = s.charAt(i);
            if (hash[c] > preP) {
                preP = hash[c];
            }
            int l = i - preP + 1;
            hash[c] = i + 1;
            if (l > max) max = l;
        }
        return max;
    }
}
