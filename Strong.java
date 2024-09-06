import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int s=0;s<t;s++){
            int n=sc.nextInt();
            //int p=sc.nextInt();
            //sc.nextLine();
            char[] arr=new char[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.next().charAt(0);
            }
            int left=0,count=0;
            for(int i=0;i<n;i++){
                System.out.print(arr[i]);
            }
        }
    }
}
