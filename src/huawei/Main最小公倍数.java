package huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/4/10.
 */
public class Main最小公倍数 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int m=scanner.nextInt();
            int n=scanner.nextInt();
            System.out.println(minCommonMultiple(m,n));
        }
    }
    // 循环法求最大公约数
    public static int maxCommonDivisor2(int m, int n) {

        while (m % n != 0) {// 在余数不能为0时,进行循环
            int temp = m % n;
            m = n;
            n = temp;
        }
        return n;// 返回最大公约数
    }
    public static int minCommonMultiple(int m, int n) {
        return m * n / maxCommonDivisor2(m, n);
    }



}
