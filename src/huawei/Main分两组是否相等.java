package huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/4/7.
 */
public class Main分两组是否相等 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int a=scanner.nextInt();
            int[] num=new int[a];
            int sum1=0;
            int sum2=0;
            for (int i = 0; i <a ; i++) {
                int temp=scanner.nextInt();
                if(temp%5==0){
                    sum1+=temp;
                }else if(temp%3==0){
                    sum2+=temp;
                }else {
                    num[i]=temp;
                }
            }
            System.out.println(isExist(sum1,sum2,num,0));
        }
    }
    public static boolean isExist(int sum1,int sum2,int[] nums,int n){
        if(n==nums.length&&sum1==sum2){
            return true;
        }if(n==nums.length&&sum1!=sum2){
            return false;
        }if(n<nums.length){
            return isExist(sum1+nums[n],sum2,nums,n+1)||isExist(sum1,sum2+nums[n],nums,n+1);
        }
        return false;
    }
}
