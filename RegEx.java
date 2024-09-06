import java.util.Scanner;

public class RegEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = sc.nextLine();

        int sLength = s.length();
        int pLength = p.length();

        for(int i=0;i<s.length();i++){
            for(int j=0;j<p.length();j++){
                if(s.charAt(i)==p.charAt(j)){
                    continue;
                }

            }
        }

//        if (pLength > 1) {
//                for (int j = 1; j < pLength; j++) {
//                    if (s.charAt(0) == p.charAt(0)) {
//                        System.out.println(p.charAt(j) == '*' || p.charAt(j) == '.');
//                        break;
//                    }
//                    else if(p.charAt(0)=='.'){
//                        System.out.println(p.charAt(j)=='*');
//                    }
//
//                }
//
//        }
//        else
//            System.out.println(sLength > 2 && pLength <= 1);

    }
}
