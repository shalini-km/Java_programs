import java.util.Scanner;

public class SelectionSort {
    public static int[] sort(int a[]){
        for(int i=0;i<a.length;i++){
          int min=i;
          for(int j=i;j<a.length;j++){
              if(a[j]<a[min]) min=j;
          }
          int temp=a[i];
          a[i]=a[min];
          a[min]=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sort(a);
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
    }
}
