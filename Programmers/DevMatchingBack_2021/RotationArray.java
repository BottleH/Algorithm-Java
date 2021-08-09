package DevMatchingBack_2021;

public class RotationArray {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] setArr = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                setArr[i][j] = i * columns + j + 1;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            answer[i] = rotationArr(setArr, queries[i]);
        }

        return answer;
    }

    private int rotationArr(int[][] setArr, int[] query) {

        int firstValue = setArr[query[0] - 1][query[1] - 1];
        int minNum = firstValue;
        for (int i = query[0] - 1; i < query[2] - 1; i++) {
            setArr[i][query[1] - 1] = setArr[i + 1][query[1] - 1];
            if (minNum > setArr[i][query[1] - 1]) {
                minNum = setArr[i][query[1] - 1];
            }
        }

        for (int i = query[1] - 1; i < query[3] - 1; i++) {
            setArr[query[2] - 1][i] = setArr[query[2] - 1][i + 1];
            if (minNum > setArr[query[2] - 1][i]) {
                minNum = setArr[query[2] - 1][i];
            }
        }

        for (int i = query[2] - 1; i > query[0] - 1; i--) {
            setArr[i][query[3] - 1] = setArr[i - 1][query[3] - 1];
            if (minNum > setArr[i][query[3] - 1]) {
                minNum = setArr[i][query[3] - 1];
            }
        }

        for (int i = query[3] - 1; i > query[1] - 1; i--) {
            setArr[query[0] - 1][i] = setArr[query[0] - 1][i - 1];
            if (minNum > setArr[query[0] - 1][i]) {
                minNum = setArr[query[0] - 1][i];
            }
        }

        setArr[query[0] - 1][query[1]] = firstValue;

        return minNum;
    }
}
