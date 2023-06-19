package programers;

import java.util.Arrays;

public class No13 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/138477
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        int[] scoreBoard = new int[k];
        int lowestScore = score[0];

        for(int i = 0; i < k; i++) {
            if(score.length - 1 < i) return answer;
            scoreBoard[i] = score[i];
            lowestScore = Math.min(lowestScore, score[i]);
            answer[i] = lowestScore;
        }

        Arrays.sort(scoreBoard);

        if(score.length < k) return answer;

        for(int i = k; i < score.length; i++) {
            if(scoreBoard[0] < score[i]) {
                scoreBoard[0] = score[i];
                Arrays.sort(scoreBoard);

            }
            answer[i] = scoreBoard[0];
        }
        return answer;
    }
}
