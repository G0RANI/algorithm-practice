package programers;

import java.util.LinkedList;
import java.util.Queue;

public class No57 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42583?language=java
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> bridgeTruck = new LinkedList<>();
        Queue<Integer> waitingTruck = new LinkedList<>();

        for(int i = 0; i < bridge_length; i++) {
            bridgeTruck.add(0);
        }

        for(int i = 0; i < truck_weights.length; i++) {
            waitingTruck.add(truck_weights[i]);
        }

        int totalWeight = 0;
        int time = 0;
        while(!waitingTruck.isEmpty()) {
            totalWeight -= bridgeTruck.poll();

            int nextTruck = waitingTruck.peek();

            if(totalWeight + nextTruck <= weight) {
                bridgeTruck.add(waitingTruck.poll());
                totalWeight += nextTruck;
            }else {
                bridgeTruck.add(0);
            }

            time++;
        }

        return time + bridge_length;
    }
}
