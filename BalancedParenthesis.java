import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {
    public static boolean trueParanthesis(String s){
        Stack<Character> stk=new Stack<>();
        for(int j=0;j<s.length();j++){
            char c=s.charAt(j);
            if(c=='['||c=='{'||c=='('){
                stk.push(c);
            }
            else{
                if(stk.isEmpty()){
                    return false;
                }
                    char a=stk.peek();
                    stk.pop();
                    if( c==']'&& a=='[' || c=='}'&& a=='{' || c==')' && a=='(')
                        continue;
                    else
                        return false;


            }
        }
        return stk.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            System.out.println(trueParanthesis(s)==true?"YES":"NO");
        }
        sc.close();
    }
}
