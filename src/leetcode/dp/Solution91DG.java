package leetcode.dp;

/*
 * Created by zhengjie on 2020/3/3.
 * 解码方法

 */
public class Solution91DG {
    public int numDecodings(String s) {
       return getAns(s,0);
    }
    public int getAns(String s,int start){
        if(start==s.length()){
            return 1;
        }
        if(s.charAt(start)-'0'==0){
            return 0;
        }
        int ans1=getAns(s,start+1);
        int ans2=0;
        int ten=(s.charAt(start)-'0')*10;
        if(start<s.length()-1){
            int one=s.charAt(start+1)-'0';
            if((ten+one)<=26){
                ans2=getAns(s,start+2);
            }
        }
        return ans1+ans2;
    }
}
