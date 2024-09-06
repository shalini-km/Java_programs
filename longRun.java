import java.util.Scanner;

public class longRun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int s=0;s<t;s++) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int left = 0, right = k-1;
            int max = Integer.MIN_VALUE;
            while (right < n) {
                int sum = 0;
                for (int i = left; i <= right; i++) {
                    sum += arr[i];
                }
                if (max < sum) {
                    max = sum;
                }
                left++;
                right++;
            }
            System.out.println(max);
        }
    }
}
