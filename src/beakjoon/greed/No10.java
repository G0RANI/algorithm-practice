package beakjoon.greed;

import java.util.Scanner;

public class No10 {
    // https://www.acmicpc.net/problem/13305

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long answer = 0L;

        int cityCount = scan.nextInt();
        long[] distances = new long[cityCount];
        long[] amounts = new long[cityCount];

        for(int i = 0 ; i < cityCount - 1; i++) {
            long distance = scan.nextLong();
            distances[i] = distance;
        }

        for(int i = 0 ; i < cityCount; i++) {
            long amount = scan.nextLong();
            amounts[i] = amount;
        }


        answer = solution(distances, amounts);

        System.out.print(answer);
    }

    public static long solution(long[] distances, long[] amounts) {
        long totalAmount = 0L;
        long minAmount = amounts[0];

        for(int i = 0; i < distances.length; i++) {
            long amount = amounts[i];
            if(amount < minAmount) {
                minAmount = amount;
            }
            totalAmount += minAmount * distances[i];
        }

        return totalAmount;
    }
}
