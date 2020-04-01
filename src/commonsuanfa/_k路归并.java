package commonsuanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengjie on 2020/3/17.
 *
 */
public class _k路归并 {
    public List<Integer> mergekSortedArrays(int[][] arrays) {
         List<Integer> list=new ArrayList<>();
         int[] a=kMergeSort(arrays,0,arrays.length-1);
         for(int i:a){
             list.add(i);
         }
         return list;
    }
    //分治递归
    public int[] kMergeSort(int[][] arrays,int start,int end){
        if(start>=end){
            return arrays[start];
        }
        int mid=(start+end)/2;
        int[] left=kMergeSort(arrays,start,mid);
        int[] right=kMergeSort(arrays,mid+1,end);
        int[]  result=mergeTwoArrays(left,right);
        return result;
    }
    public int[] mergeTwoArrays(int[] A, int[] B) {
        int[] temp = new int[A.length + B.length];
        int index = 0, i = 0, j = 0;
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                temp[index++] = A[i++];
            } else {
                temp[index++] = B[j++];
            }
        }
        while (i < A.length) {
            temp[index++] = A[i++];
        }
        while (j < B.length) {
            temp[index++] = B[j++];
        }
        return temp;
    }
}
