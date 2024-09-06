import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long ans=0;
        for(int i=0;i<n;i++){
            long j=sc.nextInt();
            ans=ans^j;
        }
        System.out.println(ans);
    }
}
