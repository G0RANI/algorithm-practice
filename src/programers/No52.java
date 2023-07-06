package programers;

public class No52 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42842?language=java
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        int width = searchAnswer(sum, yellow);
        int length = sum / width;
        answer[0] = width;
        answer[1] = length;
        return answer;
    }

    public int searchAnswer(int sum, int yellow) {
        for(int i = 1; i <= sum; i++) {
            int mayLength = sum / i;
            if(sum % i == 0 && i >= mayLength) {
                if(yellow == (mayLength - 2) * (i - 2)){
                    return i;
                }
            }
        }
        return sum;
    }
}
