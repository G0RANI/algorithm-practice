package beakjoon.bfs;

import java.util.*;


public class No2 {

    static class Node {
        int x, y, time;
        char type;

        public Node(int x, int y, int time, char type) {
            this.x = x;
            this.y = y;
            this.time = time;
            this.type = type;
        }
    }

    private static final int[] dx = {-1, 1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine();

        char[][] maze = new char[R][C];
        int[][] visited = new int[R][C];

        int startX = 0, startY = 0;
        Queue<Node> queue = new LinkedList<>();

        for (int i = 0; i < R; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < C; j++) {
                maze[i][j] = line.charAt(j);
                if (maze[i][j] == 'J') {
                    startX = i;
                    startY = j;
                } else if (maze[i][j] == 'F') {
                    queue.offer(new Node(i, j, 0, 'F'));
                    visited[i][j] = -1;
                }
            }
        }
        sc.close();

        queue.offer(new Node(startX, startY, 0, 'J'));
        visited[startX][startY] = 1;

        // 불과 지훈이 동시에 이동 (BFS)
        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.type == 'J' && (current.x == 0 || current.x == R - 1 || current.y == 0 || current.y == C - 1)) {
                System.out.println(current.time + 1);
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx >= 0 && nx < R && ny >= 0 && ny < C && maze[nx][ny] == '.' && visited[nx][ny] == 0) {
                    if (current.type == 'F') {
                        queue.offer(new Node(nx, ny, current.time + 1, 'F'));
                        visited[nx][ny] = -1;
                    } else { // current.type == 'J'
                        queue.offer(new Node(nx, ny, current.time + 1, 'J'));
                        visited[nx][ny] = 1;
                    }
                }
            }
        }

        System.out.println("IMPOSSIBLE");
    }
}