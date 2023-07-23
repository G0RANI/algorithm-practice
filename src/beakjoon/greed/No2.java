package beakjoon.greed;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class No2 {
    // https://www.acmicpc.net/problem/11399
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] time = new int[size];
        for(int i = 0; i < size; i++) {
            time[i] = scan.nextInt();
        }

        int answer = solution(time);

        System.out.print(answer);
    }

    public static int solution(int[] time) {
        Arrays.sort(time);
        int totalTime = 0;
        int cumulativeTime = 0;

        for(int i = 0; i < time.length; i++) {
            cumulativeTime += time[i];
            totalTime += cumulativeTime;
        }

        return totalTime;
    }
}
