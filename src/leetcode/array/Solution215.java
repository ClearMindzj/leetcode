package leetcode.array;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by zhengjie on 2020/3/19.
 *数组中第K个最大元素
 */
public class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        Comparator<Integer> cmp=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };
        Queue<Integer> queue=new PriorityQueue<>(cmp);
        for (int i = 0; i <nums.length ; i++) {
            queue.offer(nums[i]);
        }
        for (int i = 0; i <k-1 ; i++) {
            queue.poll();
        }
        return queue.poll();
    }

}
