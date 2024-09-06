//import java.util.Scanner;
//
//public class SlidingWindow {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        int k=sc.nextInt();
//        int left=0,right=k-1;
//        while(right<arr.length){
//            int max=Integer.MIN_VALUE;
//            for(int i=left;i<=right;i++){
//                if(max<arr[i]){
//                    max=arr[i];
//                }
//            }
//            System.out.print(max+" ");
//            left+=1;
//            right+=1;
//        }
//
//    }
//}
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class SlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            // Remove elements out of this window
            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove smaller elements in k range as they are not useful
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }

            // Add new element at the end
            deque.offerLast(i);

            // The largest element in the window is at the front of the deque
            if (i >= k - 1) {
                System.out.print(arr[deque.peekFirst()] + " ");
            }
        }
    }
}

