import java.util.Scanner;

public class CheckPrime {
    public static boolean checkPrime(int n){
        int count=0;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                count+=1;
            }
        }
        return count==1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(checkPrime(n));
    }
}
