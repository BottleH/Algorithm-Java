package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Q_17068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < T; i++) {
            stack.push(sc.nextInt());
        }
        int standard = stack.pop();
        int cnt = 1;
        int current;
        while (!stack.isEmpty()) {
            current = stack.pop();
            if (current > standard) {
                standard = current;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
