package DevMatchingBack_2021;

public class lotto {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int sameChck = 0;
        int eraseChck = 0;

        for (int lotto : lottos) {
            if (lotto == 0) {
                eraseChck++;
                continue;
            }
            for (int win_num : win_nums) {
                if (lotto == win_num) {
                    sameChck++;
                }
            }
        }

        answer[0] = 7 - (sameChck + eraseChck);
        answer[1] = 7 - (sameChck);

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == 7){
                answer[i] = 6;
            }
        }
        return answer;
    }
}
