package leetcode.string;

/**
 * Created by zhengjie on 2020/3/20.
 * 外观数列
 */
public class Solution38 {

    public String countAndSay(int n) {
       if(n==1){
           return  "1";
       }
       String s=countAndSay(n-1);
       return getString(s);

    }
    //得到当前字符串
    public String getString(String s){
        //递归出口
        if(s.length()==0){
            return "";
        }
        int num=getNum(s);
        return num+""+s.charAt(0)+getString(s.substring(num));
    }
    //统计每个字符出现的位置
    public int getNum(String s){
        int count=1;
        for (int i = 0; i <s.length()-1 ; i++) {
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }else {
                break;
            }
        }
        return count;
    }
}
