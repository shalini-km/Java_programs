import java.util.Scanner;

public class FrequencyofChar {
    public static void increment(String[] arr){
        arr[0]="sreeram";
    }
    public static void main(String[] args) {
        String[] arr ={"shalini"};
        increment(arr);
        System.out.print(arr[0]);

    }
}
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        int[]  hash=new int[26];
//        for(int i=0;i<s.length();i++){
//            char c=s.charAt(i);
//            if(c>='a'&&c<='z') {
//                hash[c-'a']++;
//            }
//        }
//        for(int i=0;i<26;i++){
//            System.out.print(hash[i]);
//        }
//    }
//
