package graph.huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/4/15.
 */
public class Main03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
          int a=scanner.nextInt();
          int[] a1=new int[a];
            for (int i = 0; i <a ; i++) {
                a1[i]=scanner.nextInt();
            }
            int[] number=new int[a];
            int[] weight=new int[a];
            int[] use1=new int[a];
            int[] use2=new int[a];
            int[] use3=new int[a];

            for (int i = 0; i <a ; i++) {

                number[i]=scanner.nextInt();
                weight[i]=scanner.nextInt();

            }
        }
    }
}
