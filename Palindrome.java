import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        int l=0,k=0;
        for(int i=0;i<len;i++){
            l=i;
            char c=str.charAt(i);
            for(int j=len-1;j>i;j--){
                if(str.charAt(i)<97){
                    c= (char) (str.charAt(i)-32);
//                    System.out.print(c);
                }
                if(c==str.charAt(j)){
                    k=j;
//                    System.out.print(str.charAt(j));
                    break;
//                    continue;
                }
            }
        }
        for(int i=l;i<=k;i++){
            System.out.print(str.charAt(i));
        }
    }
}
