package programers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class No35 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/67256
    public String solution(int[] numbers, String hand) {
        String answer = "";
        HashMap<String, List<Integer>> numberMap = new HashMap<>();
        numberMap.put("1", Arrays.asList(0, 0));
        numberMap.put("2", Arrays.asList(0, 1));
        numberMap.put("3", Arrays.asList(0, 2));
        numberMap.put("4", Arrays.asList(1, 0));
        numberMap.put("5", Arrays.asList(1, 1));
        numberMap.put("6", Arrays.asList(1, 2));
        numberMap.put("7", Arrays.asList(2, 0));
        numberMap.put("8", Arrays.asList(2, 1));
        numberMap.put("9", Arrays.asList(2, 2));
        numberMap.put("*", Arrays.asList(3, 0));
        numberMap.put("0", Arrays.asList(3, 1));
        numberMap.put("#", Arrays.asList(3, 2));


        String leftPoint = "*";
        String rightPoint = "#";
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer = answer + "L";
                leftPoint = String.valueOf(numbers[i]);
            } else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                answer = answer + "R";
                rightPoint = String.valueOf(numbers[i]);
            } else {
                List<Integer> numPoint = numberMap.get(String.valueOf(numbers[i]));
                List<Integer> leftNumPoint = numberMap.get(leftPoint);
                List<Integer> rightNumPoint = numberMap.get(rightPoint);
                int leftLength = 0;
                int rightLength = 0;

                for(int j = 0; j < 2; j++){
                    leftLength = leftLength + Math.abs(numPoint.get(j) - leftNumPoint.get(j));
                    rightLength = rightLength + Math.abs(numPoint.get(j) - rightNumPoint.get(j));
                }

                if(leftLength < rightLength) {
                    answer = answer + "L";
                    leftPoint = String.valueOf(numbers[i]);
                } else if(leftLength > rightLength) {
                    answer = answer + "R";
                    rightPoint = String.valueOf(numbers[i]);
                }else {
                    if(hand.equals("left")) {
                        answer = answer + "L";
                        leftPoint = String.valueOf(numbers[i]);
                    }else{
                        answer = answer + "R";
                        rightPoint = String.valueOf(numbers[i]);
                    }
                }


            }
        }
        return answer;
    }
}
