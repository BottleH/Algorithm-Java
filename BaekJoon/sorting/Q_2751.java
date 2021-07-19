// 2750의 방법으로는 시간초과가 뜸.
package sorting;

import java.util.*;

public class Q_2751 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        ArrayList<Integer> ls = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            ls.add(sc.nextInt());
        }

        Collections.sort(ls);

        for (int val : ls) {
            sb.append(val).append("\n");
        }
        System.out.println(sb);
    }
}
