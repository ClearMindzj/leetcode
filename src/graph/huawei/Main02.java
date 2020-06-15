package graph.huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/4/15.
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String s1=scanner.nextLine();
            String[] s=s1.split(" ");
            //s1
            String ss1=s[0];
            String[] ss=s[1].split("]");
            for (int i = 1; i <ss.length ; i++) {
                ss[i]=ss[i].substring(1);
            }
             int count=0;
            for (int i = 0; i <ss.length ; i++) {
                StringBuilder sb=new StringBuilder();
                String sss1=ss[i];
                for (int j = 0; j <sss1.length() ; j++) {
                    if(sss1.charAt(j)=='['){
                       break;
                    }else {
                        sb.append(sss1.charAt(j));
                    }
                }
                String sss2=sb.toString();
                if(compare(ss1,sss2)){
                  StringBuilder sb1=new StringBuilder();
                    for (int j = 0; j <sss1.length() ; j++) {
                        if(sss1.charAt(j)=='['){
                            sb1.append(",");
                        }else {
                            sb1.append(sss1.charAt(j));
                        }
                    }
                    String a1=sb1.toString();
                    String[] a2=a1.split(",");
                   if(a2.length==4){
                       if(a2[1].substring(0,4).equals("addr")&&a2[2].substring(0,4).equals("mask")
                       &&a2[3].substring(0,3).equals("val")){
                           System.out.print(a2[1].substring(5)+" "+a2[2].substring(5)+" "+a2[3].substring(4));
                           System.out.println();
                           count++;
                       }

                   }

                }

            }
            if(count==0){
                System.out.println("FAIL");
            }
        }
    }
    public static boolean compare(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }else if(s1.equals(s2)){
            return true;
        }
        return false;
    }

}
