package huawei.moni;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/4/15.
 */
public class Main放苹果 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int M=scanner.nextInt();
            int N=scanner.nextInt();
            System.out.println(get(M,N));
        }
    }
    public static int get(int M,int N){
        if(M<0){
            return 0;
        }
        if(M==1||N==1){
            return 1;
        }
        return get(M,N-1)+get(M-N,N);
    }
}
