package programers;

import java.util.Stack;

public class No17 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/133502
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> inputs = new Stack<>();
        for (int input : ingredient) {
            inputs.push(input);
            int inputSize = inputs.size();
            if(inputSize > 3) {
                if(inputs.get(inputSize - 4) == 1 &&
                        inputs.get(inputSize - 3) == 2 &&
                        inputs.get(inputSize - 2) == 3 &&
                        inputs.get(inputSize - 1) == 1) {
                    answer++;
                    inputs.pop();
                    inputs.pop();
                    inputs.pop();
                    inputs.pop();
                }
            }
        }

        return answer;
    }
}
