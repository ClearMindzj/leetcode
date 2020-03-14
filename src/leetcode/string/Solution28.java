package leetcode.string;

/**
 * Created by zhengjie on 2020/3/13.
 * 实现 strStr()
 */
public class Solution28 {
    public static void main(String[] args) {
         Solution28 solution28=new Solution28();
         String s1="hellolle";
         String s2="lle";
        System.out.println(solution28.strStr(s1,s2));
    }
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int j = 0;
        //遍历每个字符
        for (int i = 0; i < haystack.length(); i++) {
            //相等的话计数加 1
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
                //长度够了就返回
                if (j == needle.length()) {
                    return i - j + 1;
                }
                // 不相等的话 j 清零，
                // 并且 i 回到最初的位置，之后就进入 for 循环中的 i++，从下个位置继续判断
            } else {
                i = i - j;
                j = 0;
            }
        }
        return -1;
    }
}
