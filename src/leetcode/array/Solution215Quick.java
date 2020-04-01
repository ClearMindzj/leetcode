package leetcode.array;

/**
 * Created by zhengjie on 2020/3/19.
 * 215快排
 */
public class Solution215Quick {
        public int findKthLargest(int[] nums, int k) {
            return select(nums,0,nums.length-1,k);
        }
        public int select(int[] nums,int left,int right,int k){
            int p=partition(nums,left,right);
            //left-right第m大
            int m=right-p+1;
            if(m==k){
                return nums[p];
            }
            if(k>m){
                //k在所求前面，去前半部分
                return select(nums,left,p-1,k-m);
            }else {
                return select(nums,p+1,right,k);
            }

        }

        public int partition(int[] nums, int left, int right) {
            int temp = nums[left];
            while (left < right) {
                while (left < right && nums[right] >= temp) {
                    right--;
                }
                if (left < right) {
                    nums[left++] = nums[right];
                }
                while (left < right && nums[left] < temp) {
                    left++;
                }
                if (left < right) {
                    nums[right--] = nums[left];
                }
            }
            nums[left] = temp;
            return left;
        }
}
