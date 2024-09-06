import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Long n=sc.nextLong();
        Long count=0l;
        while(n!=0){
            Long rem=n%10;
            count+=1;
            n/=10;
        }
        System.out.print(count);
    }
}
