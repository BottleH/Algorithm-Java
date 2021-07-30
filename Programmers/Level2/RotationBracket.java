package Level2;

import java.util.LinkedList;

public class RotationBracket {
    public static int solution(String s) {
        int answer = 0;
        LinkedList<String> q = new LinkedList<>();
        q.add(s.substring(0, 1));

        for (int i = 1; i < s.length(); i++) {
            q.add(s.substring(i, i + 1));
        }

        for (int i = 0; i < q.size(); i++) {
            q.addLast(q.pollFirst());
            answer += checkBracket(q) ? 1 : 0;
        }
        return answer;
    }

    private static boolean checkBracket(LinkedList<String> q) {
        String[] temp = {"()", "[]", "{}"};
        String str = String.join("", q);

        while (str.length()!=0) {
            int checkNum = 0;
            for (String t : temp) {
                if (str.contains(t)){
                    str = str.replace(t,"");
                    checkNum++;
                }
            }
            if (checkNum == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "[](){}";
        System.out.println(solution(s));
    }
}
