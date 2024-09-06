import java.util.Scanner;

public class SumOfDivisors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=(n/i)*i;
        }
        System.out.println(sum);
    }
}


//ip
//4
//op
//15
