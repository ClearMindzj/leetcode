package graph.huawei;

import java.util.*;

/**
 * Created by zhengjie on 2020/4/21.
 */
public class HuaWei3 {

    static class Function {
        int id; //函数编号
        int stack; //栈大小
        List<Integer> callee; //被调函数

        static Function parse(String[] input) {
            Function function = new Function();
            function.id = Integer.parseInt(input[0]);
            function.stack = Integer.parseInt(input[1]);
            function.callee = new ArrayList<>();
            for (int i = 2; i < input.length; i++) {
                function.callee.add(Integer.parseInt(input[i]));
            }
            return function;
        }
    }

    public static int solve(Map<Integer, Function> functions) {
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Function> entry : functions.entrySet()) {
            Function function = entry.getValue();
            List<Integer> cost = new ArrayList<>();
            LinkedList<Integer> trace = new LinkedList<>();
            if (!dfs(functions, trace, function, 0, cost)) {
                return -1; //存在递归
            }
            max = Math.max(max, cost.stream().max(Comparator.comparingInt(a -> a)).orElse(Integer.MIN_VALUE));
        }
        return max;
    }

    //返回是否存在递归
    public static boolean dfs(Map<Integer, Function> functions, //函数
                              LinkedList<Integer> trace, //调用链
                              Function current, //当前函数
                              int stack, //栈大小
                              List<Integer> cost //所有的栈大小
    ) {
        //递归了
        if (trace.contains(current.id)) {
            return false;
        }
        List<Integer> callee = current.callee;
        //最后一个调用
        if (callee.isEmpty()) {
            cost.add(stack + current.stack);
        } else {
            trace.addLast(current.id);
            for (int func : callee) {
                if (!dfs(functions, trace, functions.get(func), stack + current.stack, cost)) {
                    return false;
                }
            }
            trace.removeLast();
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int[] invokes = new int[n];
            for (int i = 0; i < n; i++) {
                invokes[i] = in.nextInt();
            }
            in.nextLine();
            Map<Integer, Function> functions = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String line = in.nextLine();
                String[] input = line.split(" ");
                int len = input.length;
                if (len != invokes[i] + 2) {
                    System.out.println("NA");
                    return;
                }
                Function function = Function.parse(input);
                if (function.callee.contains(function.id)) {
                    System.out.println("R");
                    return;
                }
                functions.put(function.id, function);
            }
            int solve = solve(functions);
            System.out.println(solve == -1 ? "R" : solve);
        }
    }
}
