package programers;

import java.util.HashMap;

public class No6 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/160586
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        HashMap<String, Integer> ketMapping = new HashMap<>();

        for(int i = 0; i < keymap.length; i++) {
            String[] keys = keymap[i].split("");
            for(int j = 0; j < keys.length; j++) {
                if(ketMapping.get(keys[j]) == null) {
                    ketMapping.put(keys[j], j + 1);
                } else {
                    if(ketMapping.get(keys[j]) > j + 1) {
                        ketMapping.put(keys[j], j + 1);
                    }
                }
            }
        }

        for(int i = 0; i < targets.length; i++) {
            int result = 0;
            String target = targets[i];
            String[] partsOfTarget = target.split("");
            for(int j = 0; j < partsOfTarget.length; j++) {
                if(ketMapping.get(partsOfTarget[j]) != null) {
                    result += ketMapping.get(partsOfTarget[j]);
                } else {
                    result = 0;
                    break;
                }
            }
            answer[i] = result == 0 ? -1 : result;
        }

        return answer;
    }
}
