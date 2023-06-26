package programers;

import java.util.Arrays;

public class No37 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42889
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] arrivedPlayers = new int[N + 2];

        for (int stage : stages) {
            arrivedPlayers[stage]++;
        }

        Stage[] failureRates = new Stage[N];
        int totalPlayers = stages.length;

        for (int i = 1; i <= N; i++) {
            if (totalPlayers == 0) {
                failureRates[i - 1] = new Stage(i, 0);
            } else {
                double failureRate = (double) arrivedPlayers[i] / totalPlayers;
                failureRates[i - 1] = new Stage(i, failureRate);
                totalPlayers -= arrivedPlayers[i];
            }
        }

        Arrays.sort(failureRates, (s1, s2) -> {
            if (s1.failureRate == s2.failureRate) {
                return Integer.compare(s1.stageNumber, s2.stageNumber);
            }
            return Double.compare(s2.failureRate, s1.failureRate);
        });

        for (int i = 0; i < N; i++) {
            answer[i] = failureRates[i].stageNumber;
        }

        return answer;
    }

    class Stage {
        int stageNumber;
        double failureRate;

        public Stage(int stageNumber, double failureRate) {
            this.stageNumber = stageNumber;
            this.failureRate = failureRate;
        }
    }
}
