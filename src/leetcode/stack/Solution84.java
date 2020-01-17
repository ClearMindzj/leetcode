package leetcode.stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by zhengjie on 2020/1/17.
 */
public class Solution84 {
    public static void main(String[] args) {
        int[] a={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(a));
    }
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int maxArea = 0;
        int[] h;
        h = Arrays.copyOf(heights, heights.length + 1);
        while (i < h.length) {
            if (stack.isEmpty() || h[stack.peek()] <= h[i]) {
                stack.push(i);
                i++;
            } else {
                int t = stack.pop();
                maxArea = Math.max(maxArea, h[t] * (stack.isEmpty() ? i : i - stack.peek() - 1));
            }
        }
        return maxArea;
    }
}
