package leetcode.heap;

import java.util.LinkedList;

/**
 * Created by zhengjie on 2020/1/16.
 * 滑动窗口
 * peekFirst不弹出只读取
 */
public class Solution239 {

    public int[] maxSlidingWindow(int[] nums, int k) {

        int count=0;
        if(nums == null || k < 1 || nums.length < k) {
            return nums;
        }
        LinkedList<Integer> qmax = new LinkedList<Integer>();
        int[] res = new int[nums.length - k + 1];
        int index = 0;
        for(int i = 0 ; i < nums.length; i++) {
            // 如果新来的值比队列尾部的数小，那就追加到后面，因为它可能在前面的最大值划出窗口后成为最大值。
            //如果新来的值比尾部的大，那就删掉尾部
            //（因为有更大的在后面，所以它不会成为最大值，划出也是它先划出，不影响最大值），
            //再追加到后面，循环下去保证次最大值总是紧邻队头元素。
            while(!qmax.isEmpty() && nums[qmax.peekLast()]<nums[i]) {
                qmax.pollLast();
            }
            qmax.addLast(i);
            //如果追加的值比的索引跟队列头部的值的索引超过窗口大小，那就删掉头部的值
            //队头不能赖在这不走，悬差等于三时就把头部删掉。
            if(qmax.peekFirst() == i-k) {
                qmax.pollFirst();
            }
            //其实这样每次队列的头都是最大的那个。i>=2说明有三个数了
            if(i >= k -1 ) {
                res[index++] = nums[qmax.peekFirst()];
            }
        }
        return res;
    }
}
