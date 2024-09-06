import java.util.Arrays;
import java.util.Scanner;

public class ZaceBook {
    public static int frequency(char[] arr){
        int[] freq=new int[26];
        for (char c : arr) {
            int j = c - 'a';
//            System.out.println(j);
            freq[j]++;
        }
        int max=1,index=0;
        for(int i=0;i< freq.length;i++){
            if(max<freq[i]){
                max=freq[i];
                index=i;
            }
        }
        freq[index]=0;
        return index;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        char[] arr=new char[s.length()];
        int k=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ') {
                arr[k] = s.charAt(i);
//                System.out.println(arr[k]);
                k++;
            }
        }
        Arrays.sort(arr);
        String str="";
        for(int i=0;i<arr.length;i++) {
            if (i < 5) {
                int value=frequency(arr);
                if(value>0){
                    char c=(char) (value+'a');
                    str+=c;
                }
                else{
                  str+=arr[i];
                }
            }
        }
        System.out.println(str);

    }
}
