package Demo;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/3/12.
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String ss1=scanner.nextLine();
        String ss2=scanner.nextLine();
        String[] s1=ss1.split(" ");
        String[] s2=ss2.split(" ");
        int m=s1.length;
        int n=s2.length;
        int[] a1=new int[m];
        int[] a2=new int[n];
        int[] a3=new int[1001];
        int num=0;
        for (int i = 0; i <m ; i++) {
            a1[i]= Integer.parseInt(s1[i]);
        }
        for (int i = 0; i <n ; i++) {
            a2[i]=Integer.parseInt(s2[i]);
        }
        int x=a1[1];
        for (int i = 0; i <n ; i++) {
           a3[a2[i]]++;
           a2[i]=a2[i]|x;
        }
        for (int i = 0; i <a3.length; i++) {
            num=Math.max(num,a3[i]);
            a3[i]=0;
        }
        for (int i = 0; i <n ; i++) {
            a3[a2[i]]++;
        }
        for (int i = 0; i <a3.length; i++) {
            num=Math.max(num,a3[i]);
        }
        System.out.println(num);

    }

}
