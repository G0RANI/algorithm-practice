package programers;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class No21 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/131128
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        PriorityQueue<String> result = new PriorityQueue<>(Collections.reverseOrder());
        String[] targetX = X.split("");
        String[] targetY = Y.split("");

        Arrays.sort(targetX, Collections.reverseOrder());
        Arrays.sort(targetY, Collections.reverseOrder());
        int xPoint = 0;
        int yPoint = 0;
        while (xPoint < targetX.length && yPoint < targetY.length) {
            if(Integer.parseInt(targetX[xPoint]) < Integer.parseInt(targetY[yPoint])){
                yPoint++;
            } else if(Integer.parseInt(targetX[xPoint]) > Integer.parseInt(targetY[yPoint])) {
                xPoint++;
            } else {
                result.add(targetX[xPoint]);
                xPoint++;
                yPoint++;
            }
        }

        if(result.size() == 0) return "-1";

        if(result.peek().equals("0")) return "0";

        while(!result.isEmpty()) {
            answer.append(result.poll());
        }

        return answer.toString();
    }

}
