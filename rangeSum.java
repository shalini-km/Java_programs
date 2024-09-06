import java.util.Scanner;

public class rangeSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int queries=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int left=0,right=0;
        for(int i=0;i<queries;i++) {
            left = sc.nextInt();
            right = sc.nextInt();
            int sum = 0;
            for (int j = left - 1; j < right; j++) {
                sum += arr[j];
            }
            System.out.print(sum);
        }

    }
}
