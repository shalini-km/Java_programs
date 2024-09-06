import java.util.Scanner;

public class Swap {
//    public static int toArray(int n){
//
//    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        while(n!=0) {
            int rem = n % 10;
            n /= 10;
            arr[k++]=rem;
        }
        if(k%2==0) {
            for (int i = 0; i < arr.length; i++) {
                {
                    arr[i] = arr[i] ^ arr[i + 1];
                    arr[i + 1] = arr[i] ^ arr[i + 1];
                    arr[i] = arr[i] ^ arr[i + 1];
                    i++;
                }
            }
        }
        else{
            for (int i = 1; i < arr.length-1; i++) {
                {
                    arr[i] = arr[i] ^ arr[i + 1];
                    arr[i + 1] = arr[i] ^ arr[i + 1];
                    arr[i] = arr[i] ^ arr[i + 1];
                    i++;
                }
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}

//ip:123456
//op:214365


//ip:12345
//op:21435
