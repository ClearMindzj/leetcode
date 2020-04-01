package leetcode.array;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by zhengjie on 2020/3/16.
 * 滑动窗口最大值
 *
 */
public class Solution239 {
    public static void main(String[] args) {
        int[] nums={1,3,-1,-3,5,3,6,7};
        Solution239 solution239=new Solution239();
        System.out.println(solution239.maxSlidingWindow(nums,3));
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> max = new ArrayDeque<>();
        int n = nums.length;
        if (n == 0) {
            return nums;
        }
        int result[] = new int[n - k + 1];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (i >= k) {
                //一个数最多能滑动三次
                if (max.peekFirst() == nums[i - k]) {
                    max.removeFirst();
                }
            }
            while (!max.isEmpty() && nums[i] > max.peekLast()) {
                max.removeLast();
            }

            max.addLast(nums[i]);
            if (i >= k - 1) {
                result[index++] = max.peekFirst();
            }
        }
        return result;
    }

}
