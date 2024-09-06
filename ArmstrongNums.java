import java.util.Scanner;

public class ArmstrongNums {
    public static int findLength(int n){
        int len=0;
        while(n!=0){
            int rem=n%10;
            len+=1;
            n/=10;
        }
        return len;
    }
    public static boolean checkPalindrome(int n,int length){
        int sum=0,temp=n;
        while(n!=0){
            int rem=n%10;
            sum+=Math.pow(rem,length);
            n/=10;
        }
        return temp==sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int len=findLength(n);
        System.out.print(checkPalindrome(n,len));
    }
}

