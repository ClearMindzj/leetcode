package leetcode.stack;

/**
 * Created by zhengjie on 2020/1/7.
 */
public class Solution42dp {
    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
    public static  int trap(int[] height) {
        int sum=0;
        int[] max_right=new int[height.length];
        int[] max_left=new int[height.length];
         //求出左边最大高度，用dp
        for (int i = 1; i <height.length-1 ; i++) {
            max_left[i]=Math.max(max_left[i-1],height[i-1]);
        }
        //求出右边最大高度，用dp
        for (int i = height.length-2; i >0 ; i--) {
            max_right[i]=Math.max(max_right[i+1],height[i+1]);
        }
        for (int i = 1; i <height.length-1 ; i++) {
            int min=Math.min(max_left[i],max_right[i]);
            if(min>height[i])
            sum=sum+min-height[i];
        }
        return sum;
    }
}
