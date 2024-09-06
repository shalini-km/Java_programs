import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int multiplied=n1*n2;
        //Gcd
        while(n2!=0){
            int temp=n2;
            n2=n1%n2;
            n1=temp;
        }
        System.out.println("Gcd "+n1);
        System.out.printf("Lcm "+multiplied/n1);
    }
}
