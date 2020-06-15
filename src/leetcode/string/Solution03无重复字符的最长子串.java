package leetcode.string;

import java.util.HashMap;

/**
 * Created by zhengjie on 2020/3/11.
 * 无重复字符的最长子串
 */
public class Solution03无重复字符的最长子串 {
    public static void main(String[] args) {
        Solution03无重复字符的最长子串 solution03=new Solution03无重复字符的最长子串();
        System.out.println(solution03.lengthOfLongestSubstring("abba"));
    }
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int len=s.length();
        int ans=0;
        int left=0;
        for (int j= 0; j <len ; j++) {
            if(map.containsKey(s.charAt(j))){
                //为什么要max，因为后面可能出现重复的，不能再回到前面
                left=Math.max(map.get(s.charAt(j)),left);
            }
            ans=Math.max(ans,j-left+1);
            map.put(s.charAt(j),j+1);
        }
      return ans;
    }
}
