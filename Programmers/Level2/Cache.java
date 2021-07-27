package Level2;

import java.util.LinkedList;
import java.util.Locale;

public class Cache {

    static final int CHCHE_HIT = 1;
    static final int CHCHE_MISS = 5;

    public int solution(int cacheSize, String[] cities) {

        if (cacheSize == 0) {
            return cities.length * CHCHE_MISS;
        }

        int answer = 0;

        LinkedList<String> q = new LinkedList<>();

        for (String city : cities) {
            city = city.toUpperCase();
            // city 제거 성공 == hit
            if (q.remove(city)) {
                q.addFirst(city);
                answer += CHCHE_HIT;
                continue;
            }
            if (q.size() == cacheSize) {
                q.pollLast();
            }
            q.addFirst(city);
            answer += CHCHE_MISS;
        }
        return answer;
    }
}
