package beakjoon.greed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No15 {
    // https://www.acmicpc.net/problem/1946
    public static class Result implements Comparable<Result> {
        int paperScore;
        int meetingScore;

        public Result(int paperScore, int meetingScore) {
            this.paperScore = paperScore;
            this.meetingScore = meetingScore;
        }

        @Override
        public int compareTo(Result o) {
            return this.paperScore - o.paperScore;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCount = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCount; i++) {
            int resultCount = Integer.parseInt(br.readLine());
            Result[] results = new Result[resultCount];
            for(int j = 0; j < resultCount; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                results[j] = new Result(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            }
            solution(results);
        }
    }

    public static void solution(Result[] results) {
        Arrays.sort(results);
        int maxCount = 1; // 첫번째 지원자는 항상 선발
        int meetingScoreOfPaperFirst = results[0].meetingScore;

        for (int i = 1; i < results.length; i++) {
            if (results[i].meetingScore < meetingScoreOfPaperFirst) {
                meetingScoreOfPaperFirst = results[i].meetingScore;
                maxCount++;
            }
        }

        System.out.println(maxCount);
    }

}
