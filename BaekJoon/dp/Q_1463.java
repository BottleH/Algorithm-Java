package dp;

import java.util.Scanner;

public class Q_1463 {

    private static Integer[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        dp = new Integer[input + 1];
        dp[0] = dp[1] = 0;

        System.out.println(solution(input));

    }

    static int solution(int input) {

        if (dp[input] == null) {
            if (input % 6 == 0) {
                dp[input] = Math.min(solution(input - 1), Math.min(solution(input / 3), solution(input / 2))) + 1;
            }
            else if (input % 3 == 0) {
                dp[input] = Math.min(solution(input / 3), solution(input - 1)) + 1;
            }
            else if (input % 2 == 0) {
                dp[input] = Math.min(solution(input / 2), solution(input - 1)) + 1;
            }
            else {
                dp[input] = solution(input - 1) + 1;
            }
        }
        return dp[input];
    }
}
