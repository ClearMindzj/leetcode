package huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/4/5.
 */
public class Main超长正整数相加 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String a=scanner.nextLine();
            String b=scanner.nextLine();
            int m=a.length();
            int n=b.length();
            int q=Math.max(m,n);
            int carry=0;
            int[] arrayA=new int[q];
            int[] arrayB=new int[q];
            int[] result=new int[q+1];
            for (int i = 0; i <m ; i++) {
                arrayA[i]=a.charAt(m-i-1)-'0';
            }
            for (int i = 0; i <n ; i++) {
                arrayB[i]=b.charAt(n-i-1)-'0';
            }
            for (int i = 0; i <q ; i++) {
                int sum=arrayA[i]+arrayB[i]+carry;
                carry=sum/10;
                sum=sum%10;
                result[i]=sum;
            }
            if(carry>0){
                result[q]=carry;
            }
            if(result[q]==1){
                System.out.print(1);
            }
            for (int i = q-1; i >=0 ; i--) {
                System.out.print(result[i]);
            }
            System.out.println();
        }
    }

}
