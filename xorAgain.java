import java.util.Scanner;

public class xorAgain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            long a=sc.nextInt();
            long b=sc.nextInt();
            long arr[]=new long[n*n];
            int l=0;
            for(long j=a;j<=b;j++){
                for(long k=a;k<=b;k++){
                    arr[l++]=j+k;
                }
            }
            long ans=0;
            for(int j=0;j<arr.length;j++){
                ans=ans^arr[j];
            }
            System.out.println(ans);
        }
    }
}
