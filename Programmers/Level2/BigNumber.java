package Level2;

public class BigNumber {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();

        int chk = 0;
        for (int i = 0; i < number.length() - k; i++) {
            int max = 0;
            for (int j = chk; j <= i + k; j++) {
                if (max < number.charAt(j) - '0') {
                    max = number.charAt(j) - '0';
                    chk = j + 1;
                }
            }
            answer.append(max);
        }
        return answer.toString();
    }
}
