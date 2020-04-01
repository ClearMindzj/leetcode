package huawei;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by zhengjie on 2020/3/31.
 */
public class Main高精度 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String a=in.nextLine();
            String b=in.nextLine();
            BigInteger c=new BigInteger(a);
            BigInteger d=new BigInteger(b);
            System.out.println(c.add(d));
        }
    }
}
