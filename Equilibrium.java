import java.util.Scanner;

public class Equilibrium {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        int arr[]={0,-3,5,-4,-2,3,1,0};
//        int arr[]={1,2,3,-10,4,5,-3};
        int arr[]=new int[n];
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int leftSum=0,rightSum=0;
            for(int left=0;left<i;left++){
                leftSum+=arr[left];
            }
            for(int right=n-1;right>i;right--){
                rightSum+=arr[right];
            }
            if(leftSum==rightSum){
                System.out.print(i);
            }
        }

    }
}
