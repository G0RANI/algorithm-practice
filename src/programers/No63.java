package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No63 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/43164?language=java
    List<String> answerList;
    boolean[] visited;

    public String[] solution(String[][] tickets) {
        answerList = new ArrayList<>();
        visited = new boolean[tickets.length];
        Arrays.sort(tickets, (a, b) -> b[1].compareTo(a[1]));

        dfs("ICN", tickets, 0, "ICN ");

        return answerList.get(answerList.size()-1).split(" ");
    }

    public void dfs(String start, String[][] tickets, int count, String result) {
        if(count == tickets.length) {
            answerList.add(result);
            return;
        }

        for(int i = 0; i < tickets.length; i++) {
            if(!visited[i] && tickets[i][0].equals(start)) {
                visited[i] = true;
                dfs(tickets[i][1], tickets, count + 1, result + tickets[i][1] + " ");
                visited[i] = false;
            }
        }
    }
}
