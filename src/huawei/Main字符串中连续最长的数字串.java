package huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/4/7.
 */
public class Main字符串中连续最长的数字串 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String s=scanner.nextLine();
            int len=s.length();
            int max=0;
            int start=0;
            int[] dp=new int[len+1];
            for (int i = 1; i <=len ; i++) {
               if(s.charAt(i-1)>='0'&&s.charAt(i-1)<='9'){
                   dp[i]=dp[i-1]+1;
               }
               if(dp[i]>max){
                   max=dp[i];
               }
            }
            for (int i = 1; i <=len ; i++) {
                if(dp[i]==max){

                }
            }
            System.out.println(s.substring(start,start+max)+","+max);
        }
    }
}
