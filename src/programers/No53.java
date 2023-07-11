package programers;

import java.util.ArrayList;
import java.util.Stack;

public class No53 {
    public ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        Stack<Integer> numbers = new Stack<>();

        for(int number : arr) {
            if(numbers.isEmpty()) {
                answer.add(number);
                numbers.add(number);
                continue;
            }

            int target = numbers.peek();

            if(target != number) {
                answer.add(number);
            }

            numbers.add(number);
        }

        return answer;
    }
}
