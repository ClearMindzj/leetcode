package huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/4/10.
 */
public class Main记负均正 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int[] nums = new int[a];
            int count = 0;
            int count1 = 0;
            for (int i = 0; i < a; i++) {
                int b = scanner.nextInt();
                if (b < 0) {
                    count++;
                }
                if (b > 0) {
                    nums[i] = b;
                    count1++;
                }
            }
            System.out.print(count + " ");
            double sum = 0;
            double c = 0;
            for (int i : nums) {
                sum += i;
            }
            c = sum / count1;
            System.out.print(String.format("%.1f", c));
            System.out.println();
        }
    }
}
