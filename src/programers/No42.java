package programers;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class No42 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/17682
    public int solution(String dartResult) {
        int answer = 0;
        Stack<Double> stack = new Stack<>();
        List<String> results = splitString(dartResult);
        String beforeNumber = "1";
        for(String result : results) {
            if(stack.isEmpty()) {
                stack.push(Double.parseDouble(result));
                continue;
            }

            if(result.equals("S")) {
                continue;
            }else if(result.equals("D")) {
                stack.push(Math.pow(stack.pop(), 2));
            } else if(result.equals("T")) {
                stack.push(Math.pow(stack.pop(), 3));
            } else if(result.equals("*")) {
                if(stack.size() == 1) {
                    double first = stack.pop();
                    stack.push(first * 2);
                }else {
                    double second = stack.pop();
                    double first = stack.pop();
                    stack.push(first * 2);
                    stack.push(second * 2);
                }
            } else if(result.equals("#")) {
                stack.push(stack.pop() * - 1);
            } else {
                stack.push(Double.parseDouble(result));
            }
        }

        while(!stack.isEmpty()) {
            answer += stack.pop();
        }

        return answer;
    }

    private static List<String> splitString(String input) {
        List<String> parts = new ArrayList<>();

        Pattern pattern = Pattern.compile("\\d+|[A-Za-z]+|[*#]");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            parts.add(matcher.group());
        }

        return parts;
    }

}
