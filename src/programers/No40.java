package programers;

import java.util.PriorityQueue;

public class No40 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42748
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        PriorityQueue<Integer> tempQueue = new PriorityQueue<>();
        for(int i = 0; i < commands.length; i++) {
            for(int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                tempQueue.add(array[j]);
            }
            for(int k = 0; k < commands[i][2] - 1; k++) tempQueue.poll();
            answer[i] = tempQueue.poll();
            tempQueue.clear();
        }
        return answer;
    }
}
