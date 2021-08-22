package Level3;

public class Network {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] checked = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!checked[i]) {
                dfs(computers, checked, i);
                answer++;
            }
        }
        return answer;
    }

    private boolean[] dfs(int[][] computers, boolean[] checked, int i) {
        checked[i] = true;

        for (int j = 0; j < computers.length; j++) {
            if (i != j && computers[i][j] == 1 && !checked[j]) {
                checked = dfs(computers, checked, j);
            }
        }
        return checked;
    }
}
