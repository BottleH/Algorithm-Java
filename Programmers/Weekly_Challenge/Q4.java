package Weekly_Challenge;

import java.util.*;

public class Q4 {
    public static String solution(String[] table, String[] languages, int[] preference) {
        Map<Integer, String> scoreMap = new HashMap<>();

        for (String value : table) {
            String[] s = value.split(" ");
            int score = 0;
            for (int j = 0; j < languages.length; j++) {
                for (int k = 1; k < s.length; k++) {
                    if (!s[k].equals(languages[j])) {
                        continue;
                    }
                    score += preference[j] * (6 - k);
                }
            }
            if (scoreMap.getOrDefault(score, null) != null) {
                String[] compareStr = new String[2];
                compareStr[0] = scoreMap.get(score);
                compareStr[1] = s[0];
                Arrays.sort(compareStr);
                scoreMap.put(score, compareStr[0]);
                continue;
            }
            scoreMap.put(score, s[0]);
        }

        int maxScore = Collections.max(scoreMap.keySet());
        return scoreMap.get(maxScore);
    }

    public static void main(String[] args) {
        String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
        String[] languages = {"JAVA", "JAVASCRIPT"};
        int[] preference = {7, 5};
        System.out.println(solution(table, languages, preference));
    }
}
