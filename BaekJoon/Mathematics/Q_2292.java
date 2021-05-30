package Mathematics;

import java.util.Scanner;

public class Q_2292 {
    public static void main(String[] args) {
        // 방이 한개씩 늘어날 때마다 숫자는 6개씩 증가함.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 1;
        int num = 6;
        int result = 1;

        while (n > cnt) {
            result += 1;
            cnt += num;
            num += 6;
        }
        System.out.println(result);
    }
}
