package programers;

public class No16 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/134240
    public String solution(int[] food) {
        String answer = "0";
        String prefix = "";
        String postfix = "";
        for(int i = 1; i < food.length; i++) {
            String cal = String.valueOf(i);
            int addCount = food[i] / 2;
            for(int j = 0; j < addCount; j++) {
                postfix = cal + postfix;
                prefix = prefix + cal;
            }
        }
        return prefix + answer + postfix;
    }
}
