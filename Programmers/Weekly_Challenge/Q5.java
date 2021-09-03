package Weekly_Challenge;

public class Q5 {
    public int solution(String word) {
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
