package programers;

import java.util.ArrayList;

public class No45 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12977
    public int solution(int[] nums) {
        int answer = 0;

        ArrayList<Integer> targets = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    targets.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }

        for(int target : targets) {
            if(isPrime(target)) answer++;
        }

        return answer;
    }

    public boolean isPrime(int n) {
        for (int i = 2; i<=(int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
