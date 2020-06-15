    package test;

    import java.util.Scanner;

    /**
     * Created by zhengjie on 2020/4/8.
     */
    public class Main07 {
       public static int count=0;
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            while (scanner.hasNext()){
                String s=scanner.nextLine();
                int a=Integer.parseInt(s);
                for (int i = 0; i <a ; i++) {
                    String s1=scanner.nextLine();
                    String[] ss1=s1.split(" ");
                    int k=Integer.parseInt(ss1[1]);
                    int[] temp=new int[ss1[0].length()];
                    for (int j = 0; j <ss1[0].length() ; j++) {
                        temp[j]=Integer.parseInt(String.valueOf(ss1[0].charAt(j)));
                    }
                    total(temp,k,temp[0],1);
                    System.out.println(count);
                    count=0;
                }
            }
        }
        public  static void total(int[] temp,int k,int sum,int n){
            if(n==temp.length&&sum==k){
                count++;
            }if(n<temp.length){
                  total(temp,k,sum+temp[n],n+1);
                total(temp,k,sum-temp[n],n+1);
            }

        }
    }
