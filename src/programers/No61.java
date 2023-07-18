package programers;

import java.util.LinkedList;
import java.util.Queue;

public class No61 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/1844?language=java
    class Location {
        int x;
        int y;
        int count;

        public Location(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};

    static boolean[][] isVisited;
    static int n;
    static int m;

    public int solution(int[][] maps) {
        int answer = 0;

        n = maps.length;
        m = maps[0].length;

        isVisited = new boolean[n][m];

        answer = BFS(0, 0, maps);

        return answer;
    }

    public int BFS(int x, int y, int[][] maps) {
        Queue<Location> location = new LinkedList<>();
        location.offer(new Location(x, y, 1));
        isVisited[x][y] = true;

        while(!location.isEmpty()) {
            Location tempLocation =  location.poll();
            if(tempLocation.x == n - 1 && tempLocation.y == m - 1) return tempLocation.count;

            for(int i = 0; i < 4; i++) {
                int nextX = tempLocation.x + dx[i];
                int nextY = tempLocation.y + dy[i];
                if(nextX >= 0 && nextY >=0 && nextX < n && nextY < m) {
                    if(maps[nextX][nextY] == 1 && !isVisited[nextX][nextY]) {
                        isVisited[nextX][nextY] = true;
                        location.offer(new Location(nextX, nextY, tempLocation.count + 1));
                    }
                }
            }
        }

        return -1;
    }
}
