import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            int rev=0;
            while(num!=0){
                int rem=num%10;
                rev=rev*10+rem;
                num/=10;
            }
            arr[i]=rev;
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}
