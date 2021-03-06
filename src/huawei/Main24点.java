package huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/3/23.
 */
public class Main24点 {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        double result=0.0;
        int[] num=new int[4];
        while(input.hasNext()){
            int[] temp=new int[4];
            for(int i=0;i<4;i++){
                num[i]=input.nextInt();
            }
            System.out.println(is24(num,temp,result));
        }
        input.close();

    }
    public static boolean is24(int[] num,int[] temp,double result){
        for (int i = 0; i <num.length ; i++) {
            if(temp[i]==0){
                temp[i]=1;
                if(is24(num,temp,result+num[i])||
                   is24(num,temp,result-num[i])||
                   is24(num,temp,result*num[i])||
                   is24(num,temp,result/num[i])){
                    return true;
                }
                temp[i]=0;
            }
        }
        if(result==24){
            return true;
        }else {
            return false;
        }
    }
}
