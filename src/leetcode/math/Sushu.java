package leetcode.math;

import java.util.Arrays;

/**
 * Created by zhengjie on 2020/3/7.
 * 判断一个数是否为素数。
 */
public class Sushu {

    int countPrimes(int n) {
        boolean[] isPrim=new boolean[n];
        Arrays.fill(isPrim,true);
        for (int i = 2; i*i <n ; i++) {
            if(isPrim[i]){
                for (int j = i*i; j <n ; j+=i) {
                    isPrim[j]=false;
                }
            }
        }
        int count=0;
        for (int i = 2; i <n ; i++) {
            if(isPrim[n]) count++;
        }
        return count;
    }
}
