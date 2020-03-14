package leetcode.string;

import java.util.Stack;

/**
 * Created by zhengjie on 2020/3/14.
 * 翻转字符串里的单词
 */
public class Solution151 {
    public static void main(String[] args) {

    }
    public String reverseWords(String s) {
        s+=" ";
        Stack<String> stack=new Stack<>();
        StringBuilder temp=new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)==' '){
                if(temp.length()!=0){
                    stack.add(String.valueOf(temp));
                    temp=new StringBuilder();
                }
            }else {
                temp.append(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
            sb.append(" ");
        }
        return String.valueOf(sb).trim();
    }
}
