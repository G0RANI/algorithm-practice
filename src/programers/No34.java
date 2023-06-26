package programers;

import java.util.TreeSet;

public class No34 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/68644
    public int[] solution(int[] numbers) {
        int[] answer = {};
        TreeSet<Integer> sums = new TreeSet<>();
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                sums.add(numbers[i] + numbers[j]);
            }
        }
        int point = 0;
        answer = new int[sums.size()];
        for(int sum : sums) {
            answer[point] = sum;
            point++;
        }

        return answer;
    }
}
