package programers;

public class No22 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/86491
    public int solution(int[][] sizes) {
        int answer = 0;
        int wMax = 0;
        int hMax = 0;
        for(int i = 0; i < sizes.length; i++) {
            int tempWMax = Math.max(sizes[i][0], sizes[i][1]);
            int tempHMax = Math.min(sizes[i][0], sizes[i][1]);
            wMax = Math.max(wMax, tempWMax);
            hMax = Math.max(hMax, tempHMax);
        }
        return wMax * hMax;
    }
}
