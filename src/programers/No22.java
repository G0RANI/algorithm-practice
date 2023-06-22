package programers;

import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class No22 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/118666
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        HashMap<String, Integer> personalityMap = new HashMap<>();
        personalityMap.put("RT", 0);
        personalityMap.put("CF", 0);
        personalityMap.put("JM", 0);
        personalityMap.put("AN", 0);

        HashMap<Integer, Integer> pointMap = new HashMap<>();
        pointMap.put(1, 3);
        pointMap.put(2, 2);
        pointMap.put(3, 1);
        pointMap.put(4, 0);
        pointMap.put(5, -1);
        pointMap.put(6, -2);
        pointMap.put(7, -3);

        for (int i = 0; i < survey.length; i++) {
            int sign = 1;
            String sortTarget = Stream.of(survey[i].split(""))
                    .sorted()
                    .collect(Collectors.joining());
            if(!survey[i].equals(sortTarget)) sign = -1;
            personalityMap.put(sortTarget, personalityMap.get(sortTarget) + (pointMap.get(choices[i]) * sign));
        }

        for (String target : personalityMap.keySet()) {
            String[] types = target.split("");
            if (personalityMap.get(target) < 0) {
                answer.append(types[1]);
            } else {
                answer.append(types[0]);
            }
        }

        return answer.toString();
    }
}
