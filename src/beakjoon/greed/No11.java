package beakjoon.greed;

import java.util.Scanner;

public class No11 {
    // https://www.acmicpc.net/problem/10162
    static int[] times;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        times = new int[]{300, 60, 10};

        String answer = "-1";
        int target = scan.nextInt();

        answer = solution(target);

        System.out.print(answer);
    }

    public static String solution(int target) {
        StringBuilder count = new StringBuilder();

        for(int time : times) {
            count.append(target / time).append(" ");
            target = target % time;
        }

        return target == 0 ? count.toString() : "-1";
    }
}
