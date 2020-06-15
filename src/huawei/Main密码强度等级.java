package huawei;

import java.util.Scanner;

/**
 * Created by zhengjie on 2020/4/6.
 */
public class Main密码强度等级 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            System.out.println(GetPwdSecurityLevel(str));
        }
        sc.close();
    }

    public static String GetPwdSecurityLevel(String Password){
        int sum=0;
        sum+=LengthAdd(Password);
        sum+=LetterAdd(Password);
        sum+=IntegerAdd(Password);
        sum+=SymbolAdd(Password);
        sum+=AwardAdd(Password);
        if(sum>=90)
            return "VERY_SECURE";
        else if(sum>=80)
            return " SECURE";
        else if(sum>=70)
            return "VERY_STRONG";
        else if(sum>=60)
            return "STRONG";
        else if(sum>=50)
            return "AVERAGE";
        else if(sum>=25)
            return "WEAK";
        return "VERY_WEAK";
    }

    public static int LengthAdd(String Password){
        if(Password.length()<=4)
            return 5;
        else if(Password.length()>=5 && Password.length()<=7)
            return 10;
        return 25;
    }

    public static int LetterAdd(String Password){
        int UpperLetter=0;
        int LowerLetter=0;
        for(int i=0;i<Password.length();i++){
            if(Password.charAt(i)>='a'&&Password.charAt(i)<='z'){
                LowerLetter++;
            }
            if(Password.charAt(i)>='A'&&Password.charAt(i)<='Z'){
                UpperLetter++;
            }
        }
        if(UpperLetter!=0 && LowerLetter!=0)
            return 20;
        else if ((UpperLetter==0 && LowerLetter!=0) || (UpperLetter!=0 && LowerLetter==0))
            return 10;
        return 0;
    }

    public static int IntegerAdd(String Password){
        int NumOfInteger=0;
        for(int i=0;i<Password.length();i++){
            if(Password.charAt(i)>='0' && Password.charAt(i)<='9')
                NumOfInteger++;
        }
        if(NumOfInteger==0)
            return 0;
        else if(NumOfInteger==1)
            return 10;
        return 20;
    }

    public static int SymbolAdd(String Password){
        int NumOfSymbol=0;
        for(int i=0;i<Password.length();i++){
            char ch=Password.charAt(i);
            if((ch>=0x21 && ch<=0x2F) || (ch>=0x3A && ch<=0x40) || (ch>=0x5B && ch<=0x60) || (ch>=0x7B && ch<=0x7E) )
                NumOfSymbol++;
        }
        if(NumOfSymbol==0)
            return 0;
        else if(NumOfSymbol==1)
            return 10;
        return 25;
    }

    public static int AwardAdd(String Password){
        int LetterNum=Main密码强度等级.LetterAdd(Password);
        int IntegerNum=Main密码强度等级.IntegerAdd(Password);
        int SymbolNum=Main密码强度等级.SymbolAdd(Password);
        if(LetterNum!=0 && IntegerNum!=0 && SymbolNum==0)
            return 2;
        else if(LetterNum==10 && IntegerNum!=0 && SymbolNum!=0)
            return 3;
        else if(LetterNum==20 && IntegerNum!=0 && SymbolNum!=0)
            return 5;
        return 0;
    }
}
