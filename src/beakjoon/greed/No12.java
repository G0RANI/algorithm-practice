package beakjoon.greed;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class No12 {
    // https://www.acmicpc.net/problem/10610
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "-1";
        String target = scan.next();

        answer = solution(target);

        System.out.print(answer);
    }

    public static String solution(String target) {
        String answer = "-1";
        StringBuilder a = new StringBuilder();

        if(!target.contains("0")) return answer;

        String[] parts = target.split("");
        long sum = 0L;
        Arrays.sort(parts, Collections.reverseOrder());

        for(String part : parts) {
            sum += Long.parseLong(part);
            a.append(part);
        }

        if(sum % 3L == 0) {
            return a.toString();
        }

        return answer;
    }
}
