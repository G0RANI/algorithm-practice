package programers;

import java.util.HashMap;
import java.util.Objects;

public class No12 {
    public int solution(String s) {
        int answer = 0;
        String firstString = "";
        int firstCount = 0;
        int anotherCount = 0;
        String[] inputs = s.split("");

        for(String input : inputs) {
            if(firstString.equals("")) firstString = input;
            if(firstString.equals(input)){
                firstCount++;
            } else {
                anotherCount++;
            }

            if(firstCount == anotherCount) {
                answer++;
                firstString = "";
                firstCount = 0;
                anotherCount = 0;
            }
        }
        if(firstCount != anotherCount) answer++;
        return answer;
    }
}
