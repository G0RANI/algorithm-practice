package programers;

import java.util.HashMap;

public class No48 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/1845
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> poMap = new HashMap<>();
        int selectCount = nums.length / 2;
        for(int num : nums) {
            poMap.put(num, poMap.getOrDefault(num, 0) + 1);
        }
        answer = poMap.size() >= selectCount ? selectCount : poMap.size();
        return answer;
    }
}
