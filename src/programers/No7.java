package programers;

public class No7 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/159994
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int point1 = 0, point2 = 0, i = 0;

        while(i < goal.length) {
            if(point1 < cards1.length && cards1[point1].equals(goal[i])) {
                point1++;
                i++;
            } else if (point2 < cards2.length && cards2[point2].equals(goal[i])) {
                point2++;
                i++;
            } else {
                break;
            }
        }

        return i == goal.length ? "Yes" : "No";
    }
}
