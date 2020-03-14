package leetcode.string;

/**
 * Created by zhengjie on 2020/2/27.
 * 最长回文串
 */
public class Solution409 {
    public int longestPalindrome(String s) {
        int[] counts=new int[55];
        int num=0;
        for (int i = 0; i <s.length() ; i++) {
            counts[s.charAt(i)-'a']++;
        }
        for(int c :counts){
            num+=c/2*2;
        }
        if(num<s.length()){
            num++;
        }
        return num;

    }
}
