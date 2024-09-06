import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void mergeSort(int[] arr, int left, int right){
        if(left<right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, right, mid);
        }
    }
    public static void merge(int[] arr,int left,int right,int mid){
        int[] a=new int[(right-left)+1];
        int i=left;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=right){
            if(arr[i]<arr[j]){
                a[k]=arr[i++];
            }
            else{
                a[k]=arr[j++];
            }
            k+=1;
        }
        while(i<=mid){
            a[k++]=arr[i++];
        }
        while(j<=right){
            a[k++]=arr[j++];
        }
        k=0;
        for(int l=left;l<=right;l++){
            arr[l]=a[k];
            k++;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String val = s.nextLine();
        s.close();
        String[] str = val.split(" ");
        int[] arr=new int[str.length];
        for(int i=0; i<arr.length; i++){
            arr[i]=(Integer.parseInt(str[i]) );
        }
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}