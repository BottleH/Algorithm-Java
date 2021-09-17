package bruteForcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_9663 {

    private static int[] arr;
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        arr = new int[input];

        nQueen(0, input);
        System.out.println(count);
    }

    private static void nQueen(int depth, int input) {
        if (depth == input) {
            count++;
            return;
        }

        for (int i = 0; i < input; i++) {
            arr[depth] = i;

            if (isCheck(depth)) {
                nQueen(depth + 1, input);
            }
        }
    }

    private static boolean isCheck(int col) {
        for (int i = 0; i < col; i++) {
            if (arr[col] == arr[i]) {
                return false;
            }
            // 대각선
            if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }
        return true;
    }
}
