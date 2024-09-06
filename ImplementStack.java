import java.util.Scanner;
import java.util.Stack;

public class ImplementStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            String command = parts[0];

            if (command.equals("push")) {
                int num = Integer.parseInt(parts[1]);
                st.push(num);
            } else if (command.equals("pop")) {
                if (!st.isEmpty()) {
                    System.out.println(st.pop());
                } else {
                    System.out.println("Empty");
                }
            }
        }
    }
}