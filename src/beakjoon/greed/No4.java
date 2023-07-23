package beakjoon.greed;

import java.util.*;

public class No4 {
    // https://www.acmicpc.net/problem/1931
    private static class Meeting implements Comparable<Meeting> {
        int start;
        int end;

        Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Meeting o) {
            if (this.end == o.end) {
                return this.start - o.start;
            } else {
                return this.end - o.end;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Meeting[] meetings = new Meeting[n];

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            meetings[i] = new Meeting(start, end);
        }

        Arrays.sort(meetings);

        int count = 0;
        int prevEndTime = 0;
        for (int i = 0; i < n; i++) {
            if (prevEndTime <= meetings[i].start) {
                prevEndTime = meetings[i].end;
                count++;
            }
        }

        System.out.println(count);
    }
}
