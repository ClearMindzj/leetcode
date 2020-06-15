package leetcode.all;

import java.util.Stack;

/**
 * Created by zhengjie on 2020/6/8.
 */
public class Solution20有效的括号 {
    public boolean isValid(String s) {
        char[] chars=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for (char a: chars) {
            if(stack.isEmpty()){
                stack.push(a);
            }else if(isMatch(stack.peek(),a)){
                stack.pop();
            }else {
                stack.push(a);
            }
        }
        return stack.isEmpty();
    }
    public boolean isMatch(char a,char b){
        return (a=='('&&b==')')||(a=='{'&&b=='}')||(a=='['&&b==']');
    }
}
