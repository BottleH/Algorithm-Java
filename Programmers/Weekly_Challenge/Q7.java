package Weekly_Challenge;

import java.util.*;

public class Q7 {
    public static int[] solution(int[] enter, int[] leave) {
        Set<Integer> room = new HashSet<>();
        Map<Integer, Integer> meetCount = new HashMap<>();
        Queue<Integer> inQue = new LinkedList<>();
        Queue<Integer> outQue = new LinkedList<>();

        for (int i = 0; i < enter.length; i++) {
            inQue.add(enter[i]);
            outQue.add(leave[i]);
            meetCount.put(i + 1, 0);
        }

        while (!inQue.isEmpty()) {
            int in = inQue.poll();

            if (room.size() >= 1) {
                room.forEach(p -> meetCount.put(p, meetCount.get(p) + 1));
            }

            meetCount.put(in, room.size());
            room.add(in);

            while (!outQue.isEmpty() && room.contains(outQue.peek())) {
                int out = outQue.poll();
                room.remove(out);
            }
        }

        int[] answer = new int[enter.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = meetCount.get(i + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] enter = {1, 3, 2};
        int[] leave = {1, 2, 3};
        System.out.println(Arrays.toString(solution(enter, leave)));
    }
}