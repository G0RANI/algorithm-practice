package programers;

import java.util.Arrays;

public class No38 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42862
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int i = 0; i < reserve.length; i++) {
            for(int j = 0; j < lost.length; j++) {
                if(lost[j] == reserve[i]) {
                    lost[j] = -1;
                    reserve[i] = -1;
                    answer++;
                }
            }
        }

        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {
                if(reserve[j] == lost[i] - 1 || reserve[j] == lost[i] + 1) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }


        return answer;
    }

}
