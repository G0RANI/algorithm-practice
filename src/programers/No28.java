package programers;

public class No28 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/77884
    public int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right; i++) {
            int tempAnswer = 0;
            for(int j = 1; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    tempAnswer++;
                    if(i / j != j) {
                        tempAnswer++;
                    }
                }
            }
            if(tempAnswer % 2 == 0) {
                answer += i;
            }else {
                answer = answer - i;
            }
        }

        return answer;
    }
}
