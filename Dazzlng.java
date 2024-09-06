import java.util.Scanner;

public class Dazzlng {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            int value=1;
            if(num%2==0){
                    value=(num-1)^num;
            }
            else{
                    value=((num-2)^(num-1))&num;
                }
            System.out.println(value);
            }
    }
}
