package programers;

public class No19 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/132267
    public int solution(int a, int b, int n) {
        int answer = 0;

        while(n / a > 0) {
            int leftover = n % a;
            int getBack = (n - leftover) / a * b;
            n = leftover + getBack;
            answer = answer + getBack;
        }

        return answer;
    }
}
