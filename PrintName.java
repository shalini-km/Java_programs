import java.util.Scanner;

public class PrintName {
    public static String print(int n,String str){
        return str;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        int i=1;
        while(i<=n){
            System.out.print(print(i++,str)+" ");
        }
    }
}
