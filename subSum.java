import java.util.ArrayList;
import java.util.Scanner;

public class subSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
//        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                list.set(j,list.get(j)+list.get(j+1));
            }
            System.out.println(list);
            list.remove(n-2);
            n=n-1;
        }

    }
}
