package huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/4/10.
 */
public class MainRedraiment的走法 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int a=scanner.nextInt();
            int[] b=new int[a];
            for (int i = 0; i <a ; i++) {
                b[i]=scanner.nextInt();
            }
            int dp[]=new int[a+1];
            int max=0;
            for (int i = 1; i <=a ; i++) {
                dp[i]=1;
            }
            for (int i = 2; i <=a ; i++) {
                for (int j = 1; j <i ; j++) {
                    if(b[i-1]>b[j-1]){
                        dp[i]=Math.max(dp[i],dp[j]+1);
                    }
                }
                max=Math.max(max,dp[i]);
            }
            System.out.println(max);
        }
    }
}
