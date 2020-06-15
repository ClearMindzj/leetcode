package huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/4/9.
 */
public class Main表示数字02 {


    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.next();
            String res = "";
            int pos = 0;
            if(isNum(str,pos))
                res+="*";
            for(int i=0;i<str.length()-1;i++){
                if((isNum(str,i) && !isNum(str,i+1))||(!isNum(str,i) && isNum(str,i+1))){
                    res+=String.valueOf(str.charAt(i))+"*";
                }else{
                    res+=String.valueOf(str.charAt(i));
                }
            }
            if(isNum(str,str.length()-1)){
                res+=String.valueOf(str.charAt(str.length()-1))+"*";
            }else{
                res+=String.valueOf(str.charAt(str.length()-1));
            }
            System.out.println(res);
        }
        in.close();
    }
    public static boolean isNum(String str,int pos){
        return (str.charAt(pos)>='0' && str.charAt(pos)<='9');
    }
}
