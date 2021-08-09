package Weekly_Challenge;

import java.util.Arrays;

public class Q2 {
    public String solution(int[][] scores) {
        StringBuilder answer = new StringBuilder();

        int row = scores.length;
        int column = scores[0].length;
        int[] reverseScore = new int[column];

        for (int i = 0; i < column; i++) {
            int sumScore = 0;
            boolean checkDub = false;

            for (int j = 0; j < row; j++) {
                reverseScore[j] = scores[j][i];
                sumScore += reverseScore[j];
                if (reverseScore[i] == reverseScore[j] && i != j) {
                    checkDub = true;
                }
            }

            int divided = column;

            if ((reverseScore[i] == Arrays.stream(reverseScore).max().getAsInt() && !checkDub)
                    || (reverseScore[i] == Arrays.stream(reverseScore).min().getAsInt() && !checkDub)) {
                sumScore -= reverseScore[i];
                divided -= 1;
            }

            double avgScore = (double) sumScore / divided;
            answer.append(checkGrade(avgScore));
        }
        return answer.toString();
    }

    private String checkGrade(double score) {
        if (score >= 90) {
            return "A";
        }

        if (score >= 80) {
            return "B";
        }

        if (score >= 70) {
            return "C";
        }

        if (score >= 50) {
            return "D";
        }
        return "F";
    }
}
