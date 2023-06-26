package programers;

import java.util.HashMap;

public class No29 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/77484
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        HashMap<Integer, Integer> winNumMap = new HashMap<>();

        for(int winNum : win_nums) {
            winNumMap.put(winNum, winNum);
        }

        int rank = 7;
        int zeroCount = 0;

        for(int lotto : lottos) {
            if(winNumMap.containsKey(lotto)) rank--;
            if(lotto == 0) zeroCount++;
        }
        answer[0] = rank - zeroCount >= 6 ? 6 : rank - zeroCount;
        answer[1] = rank >= 6 ? 6 : rank;

        return answer;
    }
}
