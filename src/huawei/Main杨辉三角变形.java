package huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/3/30.
 */
public class Main杨辉三角变形 {


    public static int getFirstPlaceEven(int n){
        int[][] map = new int[n + 1][2*n];
        map[1][1] = 1;
        for(int i = 2; i <= n; i++){
            map[i][1] = 1;
            for(int j = 2; j <= 2 * i - 1; j++)
                map[i][j] = map[i - 1][j - 1] + map[i - 1][j - 2] + map[i - 1][j];
        }
        for(int i = 1; i <= n; i++)
            if(map[n][i] % 2 == 0)
                return i;
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            int n = input.nextInt();
            int firstEven = getFirstPlaceEven(n);
            System.out.println(firstEven);
        }
    }
}
