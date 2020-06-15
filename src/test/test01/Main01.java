package test.test01;

/**
 * Created by zhengjie on 2020/4/9.
 */
public class Main01 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(binarySearch(a, 0, a.length - 1, 0));
    }

    public static int binarySearch(int[] a, int low, int high, int target) {

        while (low <= high) {
            int mid = (low + high) / 2;
            //找到就返回
            if (target == a[mid]) {
                return mid;
            } else if (a[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        //没找到返回-1
        return -1;
    }
}
