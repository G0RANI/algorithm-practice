package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class No39 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42840
    public ArrayList<Integer> solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] firstPerson = {1, 2, 3, 4, 5};
        int[] secondPerson = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdPerson = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int firstPersonPoint = 0;
        int secondPersonPoint = 0;
        int thirdPersonPoint = 0;

        for(int i = 0; i < answers.length; i++) {
            if(firstPerson[i % (firstPerson.length)] == answers[i]) firstPersonPoint++;
            if(secondPerson[i % (secondPerson.length)] == answers[i]) secondPersonPoint++;
            if(thirdPerson[i % (thirdPerson.length)] == answers[i]) thirdPersonPoint++;
        }

        int max = Math.max(firstPersonPoint, secondPersonPoint);
        max = Math.max(max, thirdPersonPoint);

        if(firstPersonPoint == max) answer.add(1);
        if(secondPersonPoint == max) answer.add(2);
        if(thirdPersonPoint == max) answer.add(3);

        return answer;
    }

    public ArrayList<Integer> solution2(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> firstPerson = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        Queue<Integer> secondPerson = new LinkedList<>(Arrays.asList(2, 1, 2, 3, 2, 4, 2, 5));
        Queue<Integer> thirdPerson = new LinkedList<>(Arrays.asList(3, 3, 1, 1, 2, 2, 4, 4, 5, 5));

        int firstPersonPoint = 0;
        int secondPersonPoint = 0;
        int thirdPersonPoint = 0;

        for(int i = 0; i < answers.length; i++) {
            int firstAnswer = firstPerson.poll();
            int secondAnswer = secondPerson.poll();
            int thirdAnswer = thirdPerson.poll();
            if(firstAnswer == answers[i]) firstPersonPoint++;
            if(secondAnswer == answers[i]) secondPersonPoint++;
            if(thirdAnswer == answers[i]) thirdPersonPoint++;
            firstPerson.offer(firstAnswer);
            secondPerson.offer(secondAnswer);
            thirdPerson.offer(thirdAnswer);
        }

        int max = Math.max(firstPersonPoint, secondPersonPoint);
        max = Math.max(max, thirdPersonPoint);

        if(firstPersonPoint == max) answer.add(1);
        if(secondPersonPoint == max) answer.add(2);
        if(thirdPersonPoint == max) answer.add(3);

        return answer;
    }
}
