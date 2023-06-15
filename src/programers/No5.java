package programers;

public class No5 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/161989
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] wall = new int[n + 1];

        for(int i = 0; i < section.length; i++) {
            wall[section[i]] = 1;
        }

        for(int i = 1; i < wall.length; i++) {
            if(wall[i] == 1) {
                for(int j = 0; j < m; j++) {
                    if(i + j < wall.length) wall[i + j] = 0;
                }
                answer++;
            }
        }
        return answer;
    }
}
