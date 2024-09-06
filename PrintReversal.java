import java.util.Scanner;

public class PrintReversal {
    public static int print(int n){
        return n;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=n;
        while(i>0){
            System.out.print(print(i--)+" ");
        }
    }
}
