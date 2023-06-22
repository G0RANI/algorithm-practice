package programers;

public class No21 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/87389
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n-1; i++) {
            if((n -1) %i==0) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
