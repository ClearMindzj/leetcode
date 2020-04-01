package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by zhengjie on 2019/12/28.
 * 8皇后
 */
public class Solution51 {
    public static List<List<String>> output;
    public List<List<String>> solveNQueens(int n) {
          output=new ArrayList<>();
          int[] result =new int[n];
          calnQueens(0,n,result);
          return output;
    }
    private static void calnQueens(int row,int n,int[] result){
        //当前行等不等于n
        if(row==n){
            // 到达第n行代表已经得到一个将解决方案 直接返回即可
            // 根据result数组将结果加入到output列表中
            getprint(result);
            return;
        }
        // 若不是第n行 则说明需要继续判断该行棋子应该在那一列
        for (int column = 0; column <n ; column++) {
            // 判断第row行 放置在column列的棋子是否满足要求
            if(isOk(row,column,result)){
                result[row]=column;
                // 递归判断下一行的情况
                calnQueens(row+1, n, result);
            }
            // 不满足要求 回溯下一列 对应操作column++
        }
    }
    // row代表行数 column代表列数 result代表满足规则的棋子在第n行中的位置
    private static boolean isOk(int row, int column, int[] result) {
        // 判断棋子的位置是否正确 不正确返回false
        for (int i = 0; i <row ; i++) {
            // 第一个条件排除的是相同列的问题
            // 第二个条件排除的是对角线列的右下角
            // 第三个条件排除的是对角线列的左下角
            // if (column == result[i] || column==result[i]-row+i|| column == result[i] + row - i)
            if(result[i]==column||Math.abs(column-result[i])==Math.abs(row-i))
                return false;
        }
        return true;
    }

    private static void getprint(int[] result) {
        List<String> one=new ArrayList<>();
        for(int row=0;row<result.length;row++){
            // 一行一个StringBuilder
            StringBuilder sb=new StringBuilder();
            for(int column=0;column<result.length;column++){
                if(result[row]==column){
                    sb.append("Q");
                }
                else {
                    sb.append(".");
                }
            }
            one.add(sb.toString());
        }
        output.add(one);
    }
}
