package leetcode.mianshiti;

/**
 * Created by zhengjie on 2020/2/22.
 */
public class Solution0107 {
    public static void rotate(int[][] matrix) {
        int len = matrix.length;
        //左右翻
        for(int i=0;i<len;i++){
            for(int j=0;j<len/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][len-1-j];
                matrix[i][len-1-j] = temp;
            }
        }
        //对角线翻转
        for(int i=0;i<len;i++){
            for(int j=0;j<len-i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[len-1-j][len-1-i];
                matrix[len-1-j][len-1-i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotate(matrix);
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j <matrix.length ; j++) {
                System.out.print(matrix[i][j]+" ");
                if((j+1)%4==0){
                    System.out.println();
                }

            }
        }
    }
}
