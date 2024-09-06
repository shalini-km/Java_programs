import java.util.Scanner;

public class PrintNumsRecursion {
    public static int printNums(int n){
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.print(printNums(i++));
        }
    }
}
