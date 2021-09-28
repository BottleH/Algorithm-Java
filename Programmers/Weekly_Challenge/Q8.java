package Weekly_Challenge;

import java.util.Arrays;

public class Q8 {
    public int solution(int[][] sizes) {
        int max = 0;

        for (int[] size : sizes) {
            for (int i : size) {
                if (i <= max) {
                    continue;
                }
                max = i;
            }
        }

        int len = sizes.length;
        int[] minSize = new int[len];

        for (int i = 0; i < len; i++) {
            minSize[i] = Math.min(sizes[i][0], sizes[i][1]);
        }

        Arrays.sort(minSize);

        return max * minSize[minSize.length - 1];
    }
}
