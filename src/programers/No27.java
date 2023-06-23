package programers;

import java.util.HashMap;

public class No27 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/81301
    public int solution(String s) {
        int answer = 0;
        HashMap<String, String> wordsMap = new HashMap<>();
        wordsMap.put("zero", "0");
        wordsMap.put("one", "1");
        wordsMap.put("two", "2");
        wordsMap.put("three", "3");
        wordsMap.put("four", "4");
        wordsMap.put("five", "5");
        wordsMap.put("six", "6");
        wordsMap.put("seven", "7");
        wordsMap.put("eight", "8");
        wordsMap.put("nine", "9");

        for(String words : wordsMap.keySet()) {
            s = s.replace(words, wordsMap.get(words));
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}
