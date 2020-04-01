package leetcode.twopoints;

import java.util.Arrays;

/**
 * Created by zhengjie on 2020/3/15
 * 最接近的三数之和
 */
public class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sub=Integer.MAX_VALUE;
        int sum=0;
        int left,right=0;
        for (int i = 0; i <nums.length; i++) {
            left=i+1;
            right=nums.length-1;
            while (left<right){
                if(Math.abs(nums[i]+nums[left]+nums[right]-target)<sub){
                    sum=nums[i]+nums[left]+nums[right];
                    sub=Math.abs(sum-target);
                }
                if(nums[i]+nums[left]+nums[right]>target){
                    right--;
                }else {
                    left++;
                }
            }
        }
        return sum;
    }
}
