package programers;

public class No14 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/136798
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int target = 1; target <= number; target++) {
            int targetPower = 0;
            for (int i = 1; i <= Math.sqrt(target); i++) {
                if(target % i == 0) {
                    if(target / i == i) {
                        targetPower++;
                    }else {
                        targetPower+=2;
                    }
                }
            }
            if(targetPower > limit) answer += power;
            else answer += targetPower;
        }
        return answer;
    }
}
