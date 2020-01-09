package leetcode.stack;

/**
 * Created by zhengjie on 2020/1/7.
 * 接雨水 O(n平方)
 */
public class Solution42 {
    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));

    }
    public static  int trap(int[] height) {
        int sum=0;
        //两端不用考虑
        for (int i = 1; i <height.length-1 ; i++) {
            //求出当前列左边最高值
            int max_left=0;
            for (int j = i-1; j >=0; j--) {
                if(height[j]>max_left){
                    max_left=height[j];
                }
            }
            //求出当前列右边最高值
            int max_right=0;
            for (int j = i+1; j <height.length; j++) {
                if(height[j]>max_right){
                    max_right=height[j];
                }
            }
            //找出两端较小的
            int min=Math.min(max_left,max_right);
            //只有较小的一端大于当前列才会有水
            if(min>height[i]){
                sum=sum+min-height[i];
            }
        }
        return sum;
    }
}
