package programers;

import java.util.HashMap;

public class No11 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/142086
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] target = s.split("");
        HashMap<String, Integer> pointMap = new HashMap<>();
        for(int i = 0; i < s.length(); i ++) {
            if(pointMap.get(target[i]) == null) {
                answer[i] = -1;
            }else {
                Integer startPoint = pointMap.get(target[i]);
                answer[i] = i - startPoint;
            }
            pointMap.put(target[i], i);
        }
        return answer;
    }
}
