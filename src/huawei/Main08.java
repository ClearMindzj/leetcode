package huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/3/25.
 */

public class Main08 {


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        while(n>0){
            if((n&1)>0){
                count++;
            }
            n=n>>1;
        }
        System.out.println(count);
    }
}
