package beakjoon.greed;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class No3 {
    // https://www.acmicpc.net/problem/11047
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int coinCount = scan.nextInt();
        int amount = scan.nextInt();
        Integer[] kindOfCoin = new Integer[coinCount];

        for(int i = 0; i < coinCount; i++) {
            kindOfCoin[i] = scan.nextInt();
        }

        int answer = solution(kindOfCoin, amount);

        System.out.print(answer);
    }

    public static int solution(Integer[] kindOfCoin, int amount) {
        Arrays.sort(kindOfCoin, Collections.reverseOrder());
        int totalCount = 0;

        for(int i = 0; i < kindOfCoin.length; i++) {
            int coinCount = amount / kindOfCoin[i];
            totalCount += coinCount;
            amount -= kindOfCoin[i] * coinCount;
            if(amount == 0) {
                return totalCount;
            }
        }
        return totalCount;
    }
}
