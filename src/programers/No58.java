package programers;

import java.util.ArrayList;
import java.util.Stack;

public class No58 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42586?language=java
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        Stack<Integer> leftDays = new Stack<>();

        for (int i = progresses.length - 1; i >= 0; i--) {
            int remainProgress = 100 - progresses[i];
            int day = remainProgress / speeds[i];
            if (remainProgress % speeds[i] != 0) day++;
            leftDays.push(day);
        }

        ArrayList<Integer> answer = new ArrayList<>();

        while (!leftDays.isEmpty()) {
            int count = 1;
            int day = leftDays.pop();
            while (!leftDays.isEmpty() && day >= leftDays.peek()) {
                count++;
                leftDays.pop();
            }
            answer.add(count);
        }


        return answer;
    }
}
