package programers;

import java.util.ArrayList;

public class No46 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42746
    public String solution(int[] numbers) {
        StringBuffer answer = new StringBuffer();
        ArrayList<String> stringNumbers = new ArrayList<>();

        for(int number : numbers) {
            stringNumbers.add(String.valueOf(number));
        }

        if(stringNumbers.size() == 0) return "0";

        stringNumbers.sort((o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if(stringNumbers.get(0).equals("0")) return "0";

        for(String number : stringNumbers) {
            answer.append(number);
        }

        return answer.toString();
    }
}
