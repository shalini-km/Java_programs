import java.util.Scanner;

public class SumOfSeries {
    public static int Sum(int n){
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1,sum=0;
        while(i<=n){
            sum+=Sum(i++);
        }
        System.out.print(sum);
    }
}
