package lianxi;

import java.util.Stack;

/**
 * Created by zhengjie on 2020/1/15.
 */
public class Solution42Stack {

    public static int trap6(int[] height) {
        int sum=0;
        Stack<Integer> stack=new Stack<>();
        int current=0;
        while (current<height.length){
            while (!stack.isEmpty()&&height[current]>height[stack.peek()]){
                int h=height[stack.pop()];
                if(stack.isEmpty()){
                    break;
                }
                int distance=current-stack.peek()-1;
                int min=Math.min(height[current],height[stack.peek()]);
                sum=sum+distance*(min-h);
            }
            stack.push(current);
            current++;
        }
        return sum;
    }
}
