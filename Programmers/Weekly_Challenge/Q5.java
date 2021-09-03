package Weekly_Challenge;

import java.util.ArrayList;
import java.util.List;

public class Q5 {
    List<String> dictionary = new ArrayList<>();
    String aeiou = "AEIOU";

    private void dfs(String str, int len) {
        if(len > 5) {
            return;
        }

        dictionary.add(str);

        for(int i = 0; i < 5; i++){
            dfs(str + aeiou.charAt(i), len + 1);
        }
    }

    public int solution(String word) {
        dfs("", 0);
        return dictionary.indexOf(word);
    }

    public int solution2(String word) {
        int answer = 0;
        int interval = 781; // 5자리일 때 최초 간격
        char[] vowel = {'A', 'E', 'I', 'O', 'U'};

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < 5; j++) {
                if (vowel[j] != word.charAt(i)) {
                    continue;
                }
                answer += 1 + j * interval;
            }
            interval = (interval - 1) / 5;
        }
        return answer;
    }
}
