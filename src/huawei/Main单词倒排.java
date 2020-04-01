package huawei;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by zhengjie on 2020/3/28.
 */
public class Main单词倒排 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String[] s=scanner.nextLine().split(" ");
            Stack<String> stack=new Stack<>();
            for (int i = 0; i <s.length ; i++) {
                stack.push(s[i]);
            }
            StringBuilder sb=new StringBuilder();
            while (!stack.isEmpty()){
                sb.append(stack.pop()+" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
