package dp;

public class lc338 {

    /**
     * 첫번째 풀이
     * Runtime: 33 ms
     * Memory: 43.6 MB
     * 회고: 효율 낮음
     **/
    public int[] countBits1(int n) {
        int[] arr = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            String iToBinary = Integer.toBinaryString(i);
            int countOne = (int) iToBinary.chars().filter(a -> a == '1').count();
            arr[i] = countOne;
        }
        return arr;
    }
    
    /**
     * 2번째 풀이
     * Runtime: 1 ms
     * Memory: 43.1 MB
     * 회고: 일반적인 패턴 이용
    **/
    public int[] countBits2(int n) {
        int[] arr = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            arr[i] = arr[i / 2];
            if (i % 2 == 1) {
                arr[i]++;
            }
        }
        return arr;
    }
}
