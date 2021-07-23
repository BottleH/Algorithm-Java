package string;

/*
네오와 프로도가 숫자놀이를 하고 있습니다. 네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프
로도는 원래 숫자를 찾는 게임입니다.

다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.

1478 → "one4seveneight"
234567 → "23four5six7"
10203 → "1zerotwozero3"
이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다.
s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.

참고로 각 숫자에 대응되는 영단어는 다음 표와 같습니다.
 */

import java.util.HashMap;
import java.util.Map;

public class convertStringtoNum {
    public static int main(String s) {

        Map<String, String> strToNum = new HashMap<>();

        strToNum.put("zero", "0");
        strToNum.put("one", "1");
        strToNum.put("two", "2");
        strToNum.put("three", "3");
        strToNum.put("four", "4");
        strToNum.put("five", "5");
        strToNum.put("six", "6");
        strToNum.put("seven", "7");
        strToNum.put("eight", "8");
        strToNum.put("nine", "9");

        for (String k : strToNum.keySet()) {
            if (s.contains(k)) {
                s = s.replace(k, strToNum.get(k));
            }
        }

        return Integer.parseInt(s);
    }
}