package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EndWord {
    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> check = new ArrayList<>();

        int i = 0;
        while (i != words.length - 1) {
            String before = words[i].substring(words[i].length() - 1);
            String after = words[i + 1].substring(0, 1);

            if (check.contains(words[i + 1])) {
                answer[0] = (i + 2) % n == 0 ? n : (i + 2) % n;
                answer[1] = (int) Math.ceil((double) (i + 2) / n);
                return answer;
            }
            if (!before.equals(after)) {
                answer[0] = (i + 2) % n == 0 ? n : (i + 2) % n;
                answer[1] = (int) Math.ceil((double) (i + 2) / n);
                return answer;
            }
            check.add(words[i]);
            i++;
        }
        answer[0] = 0;
        answer[1] = 0;
        return answer;
    }

    public static void main(String[] args) {
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        System.out.println(Arrays.toString(solution(n, words)));
    }
}
