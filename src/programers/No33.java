package programers;

public class No33 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/68935
    public int solution(int n) {
        int answer = 0;
        String ternarySystem = Integer.toString(n, 3);
        StringBuffer sb = new StringBuffer(ternarySystem);
        answer = Integer.parseInt(sb.reverse().toString(), 3);
        return answer;
    }
}
