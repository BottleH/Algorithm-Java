package mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1629 {
    // 지수 법칙, 모듈러 법칙 사용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        System.out.println(multiply(a, b, c));

    }

    private static long multiply(long a, long b, long c) {
        if (b == 1) {
            return a % c;
        }

        long half = multiply(a, b / 2, c);

        if (b % 2 == 1) {
            return (half * half % c) * a % c;
        }
        return half * half % c;
    }
}
