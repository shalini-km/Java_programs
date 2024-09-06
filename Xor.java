import java.util.Scanner;

public class Xor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long num=0;
            for(long j=a;j<=b;j++){
                num=num^j;
            }
            if(num%2==0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }
    }
}
