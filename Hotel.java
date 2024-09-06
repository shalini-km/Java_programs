import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                list.add(sum);
            }
        }
        Collections.sort(list);
        for(int i=list.size()-1;i>=0;i--) {
            if (list.get(i) <= m) {
                System.out.println(list.get(i));
                break;
            }
        }
    }
}
