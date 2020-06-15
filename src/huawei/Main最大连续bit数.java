package huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/4/6.
 */
public class Main最大连续bit数 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int a=scanner.nextInt();
            String s=Integer.toBinaryString(a);
            int len=s.length();
            int[] dp=new int[len+1];
            int max=0;
            for (int i = 1; i <=len ; i++) {
                if(s.charAt(i-1)=='1'){
                    dp[i]=dp[i-1]+1;
                    max=Math.max(dp[i],max);
                }
            }
            System.out.println(max);
        }
    }
}
