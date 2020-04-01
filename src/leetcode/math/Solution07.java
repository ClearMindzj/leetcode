package leetcode.math;

/**
 * Created by zhengjie on 2020/3/19.
 * 整数反转
 */
public class Solution07 {
    public int reverse(int x) {
      long rev=0;
      while (x!=0){
          int pop=x%10;
          x=x/10;
          rev=rev*10+pop;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE ) return 0;
        return (int)rev;
    }
}
