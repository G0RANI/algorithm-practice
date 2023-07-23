package beakjoon.greed;

import java.util.Arrays;
import java.util.Scanner;

public class No8 {
    // https://www.acmicpc.net/problem/2217
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int answer = 0;

        int ropeQuantity = scan.nextInt();
        int[] ropes = new int[ropeQuantity];

        for(int i = 0; i < ropeQuantity; i++) {
            ropes[i] = scan.nextInt();
        }

        answer = solution(ropes);

        System.out.print(answer);
    }

    public static int solution(int[] ropes) {
        Arrays.sort(ropes);
        int mayMin = 0;
        for(int i = 0; i < ropes.length; i++) {
            mayMin = Math.max(mayMin, ropes[i] * (ropes.length - i));
        }
        return mayMin;
    }
}
