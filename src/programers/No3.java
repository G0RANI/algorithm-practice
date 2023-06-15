package programers;

public class No3 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/172928
    public int[] solution(String[] park, String[] routes) {
        boolean[][] parkArea = new boolean[park.length][park[0].length()];
        int[] startPoint = new int[2];

        for (int i = 0; i < park.length; i++) {
            char[] parkInformation = park[i].toCharArray();
            for (int j = 0; j < parkInformation.length; j++) {
                if (parkInformation[j] == 'S') {
                    parkArea[i][j] = false;
                    startPoint[0] = i;
                    startPoint[1] = j;
                } else if (parkInformation[j] == 'O') {
                    parkArea[i][j] = false;
                } else {
                    parkArea[i][j] = true;
                }
            }
        }

        for (int i = 0; i < routes.length; i++) {
            String[] route = routes[i].split(" ");
            int xPoint = startPoint[1];
            int yPoint = startPoint[0];
            int size = Integer.parseInt(route[1]);

            if (route[0].equals("E")) {
                if (park[0].length() > xPoint + size) {
                    boolean isBlock = false;
                    for (int j = 0; j <= size; j++) {
                        if (parkArea[yPoint][xPoint + j]) {
                            isBlock = true;
                        }
                    }
                    if (!isBlock) {
                        startPoint[1] = xPoint + size;
                    }
                }
            } else if (route[0].equals("W")) {
                if (0 <= xPoint - size) {
                    boolean isBlock = false;
                    for (int j = 0; j <= size; j++) {
                        if (parkArea[yPoint][xPoint - j]) {
                            isBlock = true;
                        }
                    }
                    if (!isBlock) {
                        startPoint[1] = xPoint - size;
                    }
                }
            } else if (route[0].equals("S")) {
                if (park.length > yPoint + size) {
                    boolean isBlock = false;
                    for (int j = 0; j <= size; j++) {
                        if (parkArea[yPoint + j][xPoint]) {
                            isBlock = true;
                        }
                    }
                    if (!isBlock) {
                        startPoint[0] = yPoint + size;
                    }
                }
            } else {
                if (0 <= startPoint[0] - size) {
                    boolean isBlock = false;
                    for (int j = 0; j <= size; j++) {
                        if (parkArea[yPoint - j][xPoint]) {
                            isBlock = true;
                        }
                    }
                    if (!isBlock) {
                        startPoint[0] = yPoint - size;
                    }
                }
            }
        }

        return startPoint;
    }
}
