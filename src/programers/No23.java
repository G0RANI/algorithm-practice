package programers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class No23 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/86051
    public int solution(int[] numbers) {
        int answer = 0;
        String target = Arrays.stream(numbers).mapToObj(String::valueOf).collect(Collectors.joining());
        for(int i = 0; i< 10; i++) {
            if(!target.contains(String.valueOf(i))) answer += i;
        }
        return answer;
    }
}
