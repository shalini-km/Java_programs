import java.util.ArrayList;
import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ArrayList<Character> al=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c>='A'&&c<='Z'){
                c= (char) (c-'A'+'a');
            }
            if(c>='a'&&c<='z'||c>='0'&&c<='9'){
                al.add(c);
            }
        }
        ArrayList<Character> bl=new ArrayList<>();
        for(int i=al.size()-1;i>=0;i--){
            bl.add(al.get(i));
        }
        System.out.print(al.equals(bl));
    }
}
