package leetcode.array;

import Demo.niuke.Solution;

/**
 * Created by zhengjie on 2020/3/24.
 * 搜索旋转排序树组
 * Log(n)
 */
public class Solution33 {
    public static void main(String[] args) {
        Solution33 solution33=new Solution33();
        int[] nums={4,5,6,7,0,1,2};
        System.out.println(solution33.search(nums,0));
    }
    public int search(int[] nums, int target) {
         int low=0;
         int high=nums.length-1;
         while (low<=high){
             int mid=(low+high)/2;
             if(target==nums[mid]){
                 return mid;
             }
             //前半部分有序
             if(nums[low]<=nums[mid]){
                 if(nums[low]<=target&&target<nums[mid]){
                     high=mid-1;
                 }else {
                     low=mid+1;
                 }
             }else {
                 if(nums[mid]<target&&target<=nums[high]){
                     low=mid+1;
                 }else {
                     high=mid-1;
                 }
             }

         }
         return -1;
    }

}
