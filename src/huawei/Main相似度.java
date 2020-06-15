package huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/4/5.
 */
public class Main相似度 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String a=scanner.nextLine();
            String b=scanner.nextLine();
            int c=compare(a,b)+1;
            System.out.println(1+"/"+c);
        }
    }
    public static int compare(String a,String b){
        int m=a.length();
        int n=b.length();
        int[][] dp=new int[m+1][n+1];
        for (int i = 1; i <=m ; i++) {
            dp[i][0]=i;
        }
        for (int i = 1; i <=n ; i++) {
            dp[0][i]=i;
        }
        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else {
                    dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                }
            }
        }
        return dp[m][n];
    }
}
