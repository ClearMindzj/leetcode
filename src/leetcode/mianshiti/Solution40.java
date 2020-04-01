package leetcode.mianshiti;

import java.util.Arrays;

/**
 * Created by zhengjie on 2020/3/20.
 * 最小的k个数
 */
public class Solution40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(k==arr.length){
            return arr;
        }else {
            return selectArray(arr,0,arr.length-1,k);
        }

    }
    public int[] selectArray(int[] nums,int low,int high,int k){
         int []a;
        //找到第一个点
        int p=quickSort(nums,low,high);
        if(p==k){
            a=Arrays.copyOfRange(nums,0,p);
        }else if(k>p){
             a=selectArray(nums,p+1,high,k);
        }else {
             a=selectArray(nums,low,p-1,k);
        }
        return a;

    }
    public int quickSort(int[] nums,int low,int high){
        int temp=nums[low];
        while (low<high){
            while (low<high&&nums[high]>=temp){
                high--;
            }
            if(low<high){
                nums[low++]=nums[high];
            }
            while (low<high&&nums[low]<temp){
                low++;
            }
            if(low<high){
                nums[high--]=nums[low];
            }
        }
        nums[low]=temp;
        return low;

    }
}
