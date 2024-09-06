import java.util.Scanner;

public class missingumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int sum=0;
            int n=sc.nextInt();
            int actualSum=(n+1)*(n+2)/2;
            int[] arr=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
                sum+=arr[j];
            }
            System.out.println(actualSum-sum);
        }
    }
}
