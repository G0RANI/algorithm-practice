package beakjoon.greed;

import java.util.Scanner;

public class No9 {
    // https://www.acmicpc.net/problem/1789
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long target = scan.nextLong();

        long answer = solution(target);

        System.out.print(answer);

    }

    public static long solution(long target) {
        long answer = 0;
        long count = 0;
        while (answer <= target) {
            count++;
            answer += count;
        }
        return count - 1;
    }
}
