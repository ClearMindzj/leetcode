package leetcode.dp;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;

/**
 * Created by zhengjie on 2020/3/3.
 */
public class Solution91Memoization {
    public int numDecodings(String s) {
        HashMap<Integer, Integer> map=new HashMap<>();
        return getAns(s,0,map);
    }
    public int getAns(String s, int start, HashMap<Integer,Integer> map){
        int m=map.getOrDefault(start,-1);
        if(m!=-1) return m;
        if(start==s.length()){
            return 1;
        }
        if(s.charAt(start)-'0'==0){
            return 0;
        }
        int ans1=getAns(s,start+1,map);
        int ans2=0;
        int ten=(s.charAt(start)-'0')*10;
        if(start<s.length()-1){
            int one=s.charAt(start+1)-'0';
            if((ten+one)<=26){
                ans2=getAns(s,start+2,map);
            }
        }
        map.put(start,ans1+ans2);
        return ans1+ans2;
    }
}
