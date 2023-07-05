package programers;

import java.util.HashMap;

public class No50 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/42578
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> clothesCountMap = new HashMap<>();

        for(int i = 0; i < clothes.length; i++) {
            clothesCountMap.put(clothes[i][1], clothesCountMap.getOrDefault(clothes[i][1], 0) + 1);
        }

        for(int count : clothesCountMap.values()) {
            answer = answer * (count + 1);
        }

        return answer - 1;
    }
}
