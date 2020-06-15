package leetcode.all;

import java.util.Map;

/**
 * Created by zhengjie on 2020/6/7.
 */
public class Solution29两数相除 {
    public static void main(String[] args) {
        Solution29两数相除 solution29=new Solution29两数相除();
        System.out.println(solution29.divide(100,3));
    }

    public int divide(int dividend, int divisor) {
       if(dividend==0){
           return 0;
       }
       if(dividend==Integer.MIN_VALUE&&divisor==-1){
           return Integer.MAX_VALUE;
       }
       boolean negative;
       negative=(dividend^divisor)<0;  //用异或来计算是否符号相异
       long t=Math.abs((long)dividend);
       long d=Math.abs((long)divisor);
       int result=0;
        for (int i = 31; i >=0 ; i--) {
            if((t>>i)-d>=0){         //找出足够大的数2^n*divisor
                result+=1<<i;
                t-=d*1<<i;
            }
        }
        return negative ? -result : result;//符号相异取反
    }
}
