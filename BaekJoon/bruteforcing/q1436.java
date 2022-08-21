package bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1436 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        System.out.print(findMinDoomNumber(n));
    }

    private static int findMinDoomNumber(int n) {
        int doomNumber = 666;
        int count = 1;

        while (count != n) {
            doomNumber++;

            if (Integer.toString(doomNumber).contains("666")) {
                count++;
            }
        }

        return doomNumber;
    }
}
