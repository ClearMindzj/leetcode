package commonsuanfa.sort;

/**
 * Created by zhengjie on 2020/3/17.
 * 归并排序
 */
public class 归并 {
    public void merge(int[] a,int low,int mid,int high){
       int[] temp=new int[high-low+1];
       int i=low;
       int j=mid+1;
       int k=0;
       while (i<=mid&&j<=high){
          if(a[i]>a[j]){
              temp[k++]=a[j++];
          }else {
              temp[k++]=a[i++];
          }
       }
       while (i<=mid){
           temp[k++]=a[i++];
       }
       while (j<=high){
           temp[k++]=a[j++];
       }
       //把排完序的数组复制到原来数组
        for (int l= 0; l <temp.length ; l++) {
            a[low+l]=temp[l];
        }

    }
    public void mergeSort(int[] a,int low,int high){
        int mid=(low+high)/2;
        //递归的出口
        if(low<high) {
            //递归合并左半边
            mergeSort(a, low, mid);
            //递归合并右半边
            mergeSort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
    }

    public static void main(String[] args) {
        int[] a={2,3,6,7,4};
        归并 b=new 归并();
        b.mergeSort(a,0,a.length-1);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
