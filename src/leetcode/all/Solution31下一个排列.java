package leetcode.all;

/**
 * Created by zhengjie on 2020/6/7.
 */
public class Solution31下一个排列 {

    public void nextPermutation(int[] nums) {
         int i=nums.length-2;
         //找到第一个不在递增的位置
        while (i>=0&&nums[i+1]<=nums[i]){
            i--;
        }
        //到了最左边直接输出
        if(i<0){
            reverse(nums,0);
            return;
        }
        int j=nums.length-1;
        //找到第一个大于i位置的数
        while (j>=0&&nums[j]<=nums[i]){
           j--;
        }
        //交换
        swap(nums,i,j);
        //逆转
        reverse(nums,i+1);
    }

    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

    }
    private void reverse(int[] nums,int start) {
        int i=start;
        int j=nums.length-1;
        while (i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}
