package beakjoon.bfs;

import java.util.*;
import java.io.*;

public class No1 {
    // https://www.acmicpc.net/problem/7576

    static int n, m;
    static int[][] tomatoes;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<Integer[]> queue = new LinkedList<>();;
    static int[][] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        m = Integer.parseInt(st.nextToken()); // number of columns
        n = Integer.parseInt(st.nextToken()); // number of rows

        tomatoes = new int[n][m];
        result = new int[n][m];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < m; j++){
                int tomato = Integer.parseInt(st.nextToken());
                tomatoes[i][j] = tomato;
                if(tomato == 1) {
                    queue.offer(new Integer[]{i, j});
                }
            }
        }

        bfs();

        int maxDay = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int day = result[i][j];
                if (tomatoes[i][j] == 0) {
                    System.out.print(-1);
                    return;
                }
                maxDay = Math.max(day, maxDay);
            }
        }

        System.out.print(maxDay);

    }

    public static void bfs() {
        while(!queue.isEmpty()) {
            Integer[] temp = queue.poll();
            int curX = temp[0];
            int curY = temp[1];

            for(int i = 0; i < 4; i++) {
                int nextX = curX + dx[i];
                int nextY = curY + dy[i];

                if(nextX >= 0 && nextX < n && nextY >= 0 && nextY < m) {
                    if(tomatoes[nextX][nextY] == 0) {
                        tomatoes[nextX][nextY] = 1;
                        queue.offer(new Integer[]{nextX, nextY});
                        result[nextX][nextY] = result[curX][curY] + 1;
                    }
                }
            }
        }
    }
}
