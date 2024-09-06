import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            long n=sc.nextLong();
            if(n==0) {
                System.out.println("False");
                continue;
            }
            while(n%2==0){
                n/=2;
            }
            if(n == 1) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}
