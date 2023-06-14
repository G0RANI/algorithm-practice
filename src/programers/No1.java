package programers;

import java.util.HashMap;

public class No1 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> memoryScore = new HashMap<>();
        for(int i = 0; i < name.length; i++) memoryScore.put(name[i], yearning[i]);
        for(int i = 0; i < photo.length; i++) {
            int tempScore = 0;
            for(int j = 0; j < photo[i].length; j++) {
                if(memoryScore.get(photo[i][j]) != null) tempScore = tempScore + memoryScore.get(photo[i][j]);
            }
            answer[i] = tempScore;
        }
        return answer;
    }
}
