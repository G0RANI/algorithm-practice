package programers;

import java.util.HashMap;

public class No2 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/178871?language=java
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players.clone();
        HashMap<String, Integer> playersRank = new HashMap<>();

        for(int i = 0; i < players.length; i++) playersRank.put(players[i], i);

        for(int i = 0; i < callings.length; i ++) {
            int rank = playersRank.get(callings[i]);
            String prePlayer = answer[rank - 1];
            playersRank.put(prePlayer, rank);
            playersRank.put(callings[i], rank - 1);
            answer[rank] = prePlayer;
            answer[rank -1] = callings[i];
        }

        return answer;
    }
}
