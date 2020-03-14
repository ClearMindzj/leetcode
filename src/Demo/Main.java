package Demo;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/3/12.
 * 小美曾经有一个特殊的数组，这个数组的长度为n。但是她在打恐怖游戏的时候被吓得忘记了这个数组长什么样了。不过她还记得这个数组满足一些条件。
 *
 * 首先这个数组的每个数的范围都在L和R之间。包括端点。
 *
 * 除此之外，这个数组满足数组中的所有元素的和是k的倍数。
 *
 * 但是这样的数组太多了，小美想知道有多少个这样的数组。你只需要告诉她在模1e9+7意义下的答案就行了。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();
        if(s1.charAt(0)=='X'){
            System.out.println(-1);
        }else {
            int[][] dp = new int[3][n + 1];
            dp[1][1] = 1;
            dp[2][1] = 0;
            int i = 2;
            while (i <= n) {
                if (s1.charAt(i - 1) == '.') {
                    dp[1][i] = dp[1][i - 1] + dp[2][i - 1];
                }
                if (s2.charAt(i - 1) == '.') {
                    dp[2][i] = dp[2][i - 1] + dp[1][i - 1];
                }
                i++;
            }
            if(dp[2][n]==0){
                System.out.println(-1);
            }else {
                System.out.println(dp[2][n]);
            }

        }
    }

}
