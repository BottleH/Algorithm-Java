package bruteForcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_3040 {

    private static int[] input = new int[9];
    private static int[] result = new int[7];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        oneHundred(0, 0);
    }

    private static void oneHundred(int depth, int num) {
        if (depth == 7) {
            if (Arrays.stream(result).sum() == 100) {
                for (int i = 0; i < 7; i++) {
                    System.out.println(result[i]);
                }
            }
            return;
        }

        for (int i = num; i < 9; i++) {
            result[depth] = input[i];
            oneHundred(depth + 1, i + 1);
        }
    }
}
