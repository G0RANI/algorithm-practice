package programers;

import java.util.HashMap;

public class No41 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42576
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> participantMap = new HashMap<>();
        for(String name : participant) {
            participantMap.put(name, participantMap.getOrDefault(name, 0) + 1);
        }
        for(String name : completion) {
            int count = participantMap.get(name);
            if(count - 1 == 0) participantMap.remove(name);
            else participantMap.put(name, count -1);
        }
        for(String name : participantMap.keySet()) {
            return name;
        }
        return answer;
    }
}
