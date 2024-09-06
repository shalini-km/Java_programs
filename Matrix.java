public class Matrix {
    public static void main(String[] args) {
        int n = 3, num = 1;
        for (int i = 0; i < n; i++) {
//            System.out.print(num);
            for (int j = 0; j < n; j++) {
//                if(i%2!=0){
//                    num=num+(n-i-j);
//                    System.out.print(--num+" ");
//                }
//                else
                System.out.print(num++ + " ");
            }
                System.out.println();
        }
    }
}
