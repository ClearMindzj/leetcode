package leetcode.twopoints;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by zhengjie on 2020/1/17.
 * 双指针，3数之和。
 */
public class Solution15 {

    public static void main(String[] args) {
        int[] nums={-1,-1,0,1,2};
        System.out.println(threeSum(nums));

    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); //排序
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < nums.length-2; i++) {
            //为了保证不加入重复的 list,因为是有序的，所以如果和前一个元素相同，只需要继续后移就可以
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                //两个指针,并且头指针从i + 1开始，防止加入重复的元素
                int lo = i+1, hi = nums.length-1, sum = 0 - nums[i];
                //每移动一次就要判断一次
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        //元素相同要后移，防止加入重复的 list
                        while (lo < hi && nums[lo] == nums[lo+1]) lo++;
                        while (lo < hi && nums[hi] == nums[hi-1]) hi--;
                        lo++; hi--;
                    } else if (nums[lo] + nums[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return res;
    }
}
