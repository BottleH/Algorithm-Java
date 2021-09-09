package Weekly_Challenge;

import java.util.ArrayList;
import java.util.List;

public class Q6 {
    private static int compare(Boxer o1, Boxer o2) {
        if (o1.winRate > o2.winRate) {
            return -1;
        } else if (o1.winRate == o2.winRate) {
            if (o1.vsHeavyWinCnt > o2.vsHeavyWinCnt) {
                return -1;
            } else if (o1.vsHeavyWinCnt == o2.vsHeavyWinCnt) {
                if (o1.weight > o2.weight) {
                    return -1;
                } else if (o1.weight == o2.weight) {
                    if (o1.index > o2.index) {
                        return 1;
                    } else {
                        return -1;
                    }
                } else {
                    return 1;
                }
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    public int[] solution(int[] weights, String[] head2head) {
        List<Boxer> boxerList = new ArrayList<>();

        for (int i = 0; i < head2head.length; i++) {
            String[] head2headSplit = head2head[i].split("");
            int winCount = 0;
            int vsHeavyWinCnt = 0;
            int notPlay = 0;
            double winRate;
            for (int j = 0; j < head2headSplit.length; j++) {
                if ("W".equals(head2headSplit[j])) {
                    winCount++;
                    if (weights[j] > weights[i]) {
                        vsHeavyWinCnt++;
                    }
                }
                if ("N".equals(head2headSplit[j])) {
                    notPlay++;
                }
            }
            if (head2headSplit.length == notPlay) {
                winRate = 0;
                boxerList.add(new Boxer(i + 1, winRate, vsHeavyWinCnt, weights[i]));
                continue;
            }
            winRate = (double) winCount / (head2headSplit.length - notPlay);
            boxerList.add(new Boxer(i + 1, winRate, vsHeavyWinCnt, weights[i]));
        }

        boxerList.sort(Q6::compare);

        int[] answer = new int[head2head.length];
        for (int i = 0; i < boxerList.size(); i++) {
            answer[i] = boxerList.get(i).index;
        }

        return answer;
    }
}

class Boxer {
    int index;
    double winRate;
    int vsHeavyWinCnt;
    int weight;

    public Boxer(int index, double winRate, int vsHeavyWinCnt, int weight) {
        this.index = index;
        this.winRate = winRate;
        this.vsHeavyWinCnt = vsHeavyWinCnt;
        this.weight = weight;
    }
}
