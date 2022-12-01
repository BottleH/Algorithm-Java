package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] kArray = new int[k];

        for (int i = 0; i < kArray.length; i++) {
            kArray[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(kArray);

        long maxLine = kArray[k-1];
        long minLine = 1;
        long midLine;

        while (maxLine >= minLine) {
            midLine = (maxLine + minLine) / 2;
            long count = 0;

            for (int i : kArray) {
                count += i / midLine;
            }

            if (count >= n) {
                minLine = midLine + 1;
                continue;
            }
            maxLine = midLine - 1;
        }
        System.out.print(maxLine);
    }
}
