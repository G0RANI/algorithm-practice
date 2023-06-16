package programers;

public class No10 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/147355
    public int solution(String t, String p) {
        int answer = 0;
        int startPoint = 0;
        for(int i = p.length(); i <= t.length(); i++) {
            String substringResult = t.substring(startPoint, i);
            long intResult = Long.parseLong(substringResult);
            long input = Long.parseLong(p);
            if(input >= intResult) answer++;
            startPoint++;
        }

        return answer;
    }
}
