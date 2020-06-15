package test;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/4/8.
 */
public class Main06 {
    public static int count=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int a=scanner.nextInt();
            for (int i = 0; i <a ; i++) {
                String s1=scanner.next();
                int k=scanner.nextInt();
                int[] temp=new int[s1.length()];
                for (int j = 0; j <s1.length() ; j++) {
                    temp[j]=Integer.parseInt(String.valueOf(s1.charAt(j)));
                }
                total(temp,k,temp[0],1);
                System.out.println(count);
                count=0;
            }
        }
    }
    public  static void total(int[] temp,int k,int sum,int n){
       if(n==temp.length&&sum==k){
          count++;
       }if(n<temp.length){
            total(temp,k,sum+temp[n],n+1);
            total(temp,k,sum-temp[n],n+1);
        }
       return;
    }
}
