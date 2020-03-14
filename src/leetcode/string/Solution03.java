package leetcode.string;

import java.util.HashMap;

/**
 * Created by zhengjie on 2020/3/11.
 * 无重复字符的最长子串
 */
public class Solution03 {
    public static void main(String[] args) {
        Solution03 solution03=new Solution03();
        System.out.println(solution03.lengthOfLongestSubstring("acbabc"));
    }
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int len=s.length();
        int ans=0;
        for (int j= 0,i=0; j <len ; j++) {
            if(map.containsKey(s.charAt(j))){
                i=Math.max(map.get(s.charAt(j)),i);
            }
            ans=Math.max(ans,j-i+1);
            map.put(s.charAt(j),j+1);
        }
      return ans;
    }
}
