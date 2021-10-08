package Weekly_Challenge;

import java.util.*;

public class Q4 {
    public String solution(String[] table, String[] languages, int[] preference) {
        Map<String, Integer> scoreMap = new HashMap<>();

        // map에 미리 저장함으로 for문 1번 줄임.
        for (int i = 0; i < languages.length; i++) {
            scoreMap.put(languages[i], preference[i]);
        }

        int maxNumber = 0;
        String answer = "";

        for (String value : table) {
            String[] s = value.split(" ");
            int score = 0;
            for (int j = 1; j < s.length; j++) {
                if (!scoreMap.containsKey(s[j])) {
                    continue;
                }
                score += scoreMap.get(s[j]) * (6 - j);
            }

            if (maxNumber < score) {
                maxNumber = score;
                answer = s[0];
                continue;
            }
            // 사전 순 비교
            if (maxNumber == score) {
                if (answer.compareTo(s[0]) > 0) {
                    answer = s[0];
                }
            }
        }

        return answer;
    }
}
