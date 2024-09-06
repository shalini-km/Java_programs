import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n,rev=0;
        while(n!=0){
          int rem=n%10;
          rev=rev*10+rem;
          n/=10;
        }
        System.out.print (temp==rev);
    }
}
