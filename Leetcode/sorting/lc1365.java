package sorting;

public class lc1365 {
    /**
     * 첫번째 풀이
     * Runtime: 12ms
     * Memory: 39.2 MB
     */
    public int[] smallerNumbersThanCurrent1(int[] nums) {
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int num : nums) {
                if (nums[i] <= num) {
                    continue;
                }
                count++;
            }
            answer[i] = count;
        }
        return answer;
    }

    /**
     * 두번째 풀이
     * Runtime: 1ms
     * Memory: 39.1 MB
     */
    public int[] smallerNumbersThanCurrent2(int[] nums) {
        int[] buck = new int[101];

        // index별 count 저장
        for (int num : nums) {
            buck[num] += 1;
        }

        //  index의 count 값이므로 이전 인덱스 값들 추가하여 보다 작은 숫자들의 갯수 파악
        for (int j = 1; j <= 100; j++) {
            buck[j] += buck[j - 1];
        }

        // 0인 것들은 0으로 처리
        for (int k = 0; k < nums.length; k++) {
            int pos = nums[k];
            nums[k] = pos == 0 ? 0 : buck[pos - 1];
        }
        return nums;
    }
}
