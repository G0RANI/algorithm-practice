package beakjoon.greed;

import java.util.Scanner;

public class No1 {
    // https://www.acmicpc.net/problem/2839
    public static void main(String[] args) {
        int answer = -1;
        Scanner scan = new Scanner(System.in);
        int target = scan.nextInt();
        int fiveCount = target/5;
        target = target % 5;

        for(int i = 0; i <= fiveCount; i++) {
            if(target % 3 == 0) {
                System.out.print(fiveCount - i + target / 3);
                return;
            }
            target += 5;
        }
        System.out.print(answer);
    }
}
