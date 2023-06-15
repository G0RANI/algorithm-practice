package programers;

import java.util.ArrayList;
import java.util.Collections;

public class No4 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/161990
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        ArrayList<Integer> yPoints = new ArrayList<>();
        ArrayList<Integer> xPoints = new ArrayList<>();
        for(int i = 0; i < wallpaper.length; i++) {
            char[] areas = wallpaper[i].toCharArray();
            for(int j = 0; j < areas.length; j++) {
                if(areas[j] == '#') {
                    yPoints.add(i);
                    xPoints.add(j);
                }
            }
        }
        Collections.sort(yPoints);
        Collections.sort(xPoints);
        answer[0] = yPoints.get(0);
        answer[1] = xPoints.get(0);
        answer[2] = yPoints.get(yPoints.size() - 1) + 1;
        answer[3] = xPoints.get(xPoints.size() - 1) + 1;
        return answer;
    }
}
