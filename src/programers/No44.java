package programers;

import java.util.Arrays;

public class No44 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12982
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int totalMoney = 0;
        for(int i = 0; i < d.length; i++) {
            totalMoney += d[i];
            if(totalMoney > budget) {
                break;
            } else if(totalMoney <= budget) {
                answer++;
            }
        }
        return answer;
    }
}
