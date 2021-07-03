package String;

import java.util.Scanner;

public class Q_1053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String[] n = sc.next().split(",");
            int a = Integer.parseInt(n[0]);
            int b = Integer.parseInt(n[1]);
            System.out.println(a + b);
        }
    }
    // 이 문제에서 배울점과 핵심은 sc.next() 함수다.
}
