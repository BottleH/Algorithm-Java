package BruteForcing;

import java.util.Scanner;

public class Q_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int check;
        for (int i = 0; i < N; i++) {
            check = divSum(i);

            if (check == N) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }

    private static int divSum(int n) {
        int temp_sum = 0;
        int m = n;

        while (m != 0) {
            temp_sum += m % 10;
            m /= 10;
        }
        return temp_sum + n;
    }
}
