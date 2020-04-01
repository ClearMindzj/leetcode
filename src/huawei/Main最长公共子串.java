package huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/3/31.
 */
public class Main最长公共子串 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.next();
            String s2 = sc.next();

            getcommenstrLength(s1,s2);
        }
    }
    private static void getcommenstrLength(String s1, String s2){
        if(s1.length()>s2.length()){
            String temp=s1;
            s1=s2;
            s2=temp;
        }
        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();
        int lena=s1.length();
        int lenb=s2.length();
        int max=0;
        int start=0;
        int[][]dp=new int[lena+1][lenb+1];
        for (int i = 1; i <=lena ; i++) {
            for (int j = 1; j <=lenb ; j++) {
                if(a[i-1]==b[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;

                }
                if(dp[i][j]>max){
                    max=dp[i][j];
                    start=i-max;
                }

            }
        }

        System.out.println(s1.substring(start,start+max));
    }
}
