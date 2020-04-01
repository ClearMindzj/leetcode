package test;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/4/1.
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int a=scanner.nextInt();
            while (a-->0){
                String s1=scanner.next();
                char[] c1=s1.toCharArray();
                int len=c1.length;
                 if(len==1&&c1[0]=='0'){
                     System.out.println(0);
                 }
                 if(len==1&&c1[0]=='1'){
                     System.out.println(1);
                 }
                 if(len==2){
                     if(c1[0]==c1[1]&&c1[0]=='1'){
                         System.out.println(1);
                     }else if(c1[0]==c1[1]&&c1[0]=='0'){
                         System.out.println(0);
                     }else {
                         System.out.println("No");
                     }
                 }
                 if(len>=3&&((c1[0]!=c1[1]&&c1[0]==c1[2])||(c1[len-1]!=c1[len-2]&&c1[len-1]==c1[len-3]))){
                    System.out.println("No");
                }
            }


        }
    }
}
