import java.util.Scanner;

public class Vehicle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int wheels=sc.nextInt();
        int vehicle=sc.nextInt();
        int two=0,four=0;
        two=(4*vehicle-wheels)/2;
        four=vehicle-two;
        System.out.println("Two Wheeler: "+two);
        System.out.print("Four Wheeler: "+four);

    }
}
