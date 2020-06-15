package leetcode.all;

/**
 * Created by zhengjie on 2020/6/12.
 */
public class Solution34排序数组中查找第一个和最后一个位置 {

    public static void main(String[] args) {
        Solution34排序数组中查找第一个和最后一个位置 solution34=new Solution34排序数组中查找第一个和最后一个位置();
        int[] nums={1};
        System.out.println(solution34.searchRange(nums,0));
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int start=0;
        int end=nums.length-1;
        if (nums.length == 0) {
            return ans;
        }
        while (start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                end=mid-1;
            }else if(target<nums[mid]){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }

        //防止不存在数据数组下标越界
        if(start==nums.length||nums[start]!=target){
            return ans;
        }else {
            ans[0]=start;
        }
        start=0;
        end=nums.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                start=mid+1;
            }else if(target<nums[mid]){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        if(nums[end]==target){
            ans[1]=end;
        }
        return ans;
    }
}
