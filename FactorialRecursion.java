import java.util.Scanner;

public class FactorialRecursion {
    public static int Factorial(int n){
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1,factorial=1;
        while(i<=n){
            factorial*=Factorial(i++);
        }
        System.out.print(factorial);
    }
}
