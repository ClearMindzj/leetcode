package commonsuanfa.nixuduishu;

/**
 * Created by zhengjie on 2020/2/19.
 * 暴力
 */
public class Test01 {
    //蛮力法求取数组A中逆序对数
    public static int bruteReverseCount(int[] A) {
        int result = 0;
        for(int i = 0;i < A.length;i++) {
            for(int j = i;j < A.length;j++) {
                if(A[i] > A[j])
                    result++;
            }
        }
        return result;

    }
    public static int[] getRandomArray(int n) {
        int[] result = new int[n];
        for(int i = 0;i < n;i++) {
            result[i] = (int)( Math.random() * 50);  //生成0~50之间的随机数
        }
        return result;
    }

    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        int arr[] = {7,6, 6, 5, 4, 3, 2, 1 };
        int result=bruteReverseCount(arr);
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime+"ms");
        System.out.println("逆序数："+result);
    }
}
