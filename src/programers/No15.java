package programers;

import java.util.Arrays;

public class No15 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/135808
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int boxCount = score.length / m;
        Arrays.sort(score);
        int endPoint = score.length - m;
        for(int i = 0; i < boxCount; i++) {
            int startGrade = score[endPoint - (m * i)];
            answer += startGrade * m;
        }
        return answer;
    }

}
