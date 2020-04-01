package commonsuanfa.nixuduishu;

import java.util.Arrays;

/**
 * Created by zhengjie on 2020/2/20.
 */
public class Main {
    public long count = 0;   //全局变量，使用合并排序，计算逆序对数
    //使用归并排序方法计算数组A中的逆序对数
    public void getReverseCount(int[] A) {
        if(A.length > 1) {
           /* int[] leftA = getHalfArray(A, 0);   //数组A的左半边元素
            int[] rightA = getHalfArray(A, 1);  //数组A的右半边元素*/
            int length = A.length;
            int alength = length / 2;
            int leftA[] = Arrays.copyOfRange(A,0, alength);
            int rightA[] = Arrays.copyOfRange(A, alength, length);
            //统计左半边
            getReverseCount(leftA);
            //统计右半边
            getReverseCount(rightA);
            mergeArray(A, leftA, rightA);
        }

    }
   //根据judge值判断，获取数组A的左半边元素或者右半边元素
    /*public int[] getHalfArray(int[] A, int judge) {
        int[] result;
        if(judge == 0) {   //返回数组A的左半边
            result = new int[A.length / 2];
            for(int i = 0;i < A.length / 2;i++)
                result[i] = A[i];
        } else {    //返回数组的右半边
            result= new int[A.length - A.length / 2];
            for(int i = 0;i < A.length - A.length / 2;i++)
                result[i] = A[A.length / 2 + i];
        }
        return result;
    }*/
    //合并数组A的左半边和右半边元素，并按照非降序序列排列
    public void mergeArray(int[] A, int[] leftA, int[] rightA) {
        int len = 0;
        int i = 0;
        int j = 0;
        int lenL = leftA.length;
        int lenR = rightA.length;
        while(i < lenL && j < lenR) {
            if(leftA[i] > rightA[j]) {
                A[len++] = rightA[j++]; //将rightA[j]放在leftA[i]元素之前，那么leftA[i]之后lenL - i个元素均大于rightA[j]
                count += (lenL - i);   //合并之前，leftA中元素是非降序排列，rightA中元素也是非降序排列。所以，此时就新增lenL -　i个逆序对
            } else {
                A[len++] = leftA[i++];
            }
        }
        while(i < lenL)
            A[len++] = leftA[i++];
        while(j < lenR)
            A[len++] = rightA[j++];
    }
    //获取一个随机数数组
    public int[] getRandomArray(int n) {
        int[] result = new int[n];
        for(int i = 0;i < n;i++) {
            result[i] = (int)( Math.random() * 50);  //生成0~50之间的随机数
        }
        return result;
    }

    public static void main(String[] args){
        long t1 = System.currentTimeMillis();
        Main test = new Main();
        //int[] A = test.getRandomArray(50000);
        int arr[] = { 6, 5, 4, 3, 2, 1 };
        test.getReverseCount(arr);
        long t2 = System.currentTimeMillis();
        System.out.println("分治法得到结果："+test.count+"， 耗时："+(t2 - t1)+"毫秒");
    }
}
