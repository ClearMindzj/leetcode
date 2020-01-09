package leetcode.stack;

import java.util.Stack;

/**
 * Created by zhengjie on 2020/1/6.
 * 通过
 */
public class Solution20 {
    public static void main(String[] args) {

    }
    public boolean isValid(String s) {
        char[] chars=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(char a:chars){
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
