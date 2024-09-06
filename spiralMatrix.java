import java.util.Scanner;

public class spiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int m = 0; m < size; m++) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }
            int left = 0, right = n - 1;
            int top = 0, bottom = n - 1;
            while (left <= right && top <= bottom) {
                for (int i = left; i <= right; i++) {
                    System.out.print(arr[top][i]+" ");
                }
                top += 1;
                for (int i = top; i <= bottom; i++) {
                    System.out.print(arr[i][right]+" ");
                }
                right -= 1;
                if (top < bottom) {
                    for (int i = right; i >= left; i--) {
                        System.out.print(arr[bottom][i]+" ");
                    }
                    bottom -= 1;
                }
                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        System.out.print(arr[i][left]+" ");
                    }
                    left += 1;
                }
            }
            System.out.println();
        }
    }
}
