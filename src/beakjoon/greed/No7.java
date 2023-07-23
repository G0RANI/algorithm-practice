package beakjoon.greed;

import java.util.Scanner;

public class No7 {
    // https://www.acmicpc.net/problem/5585
    static int answer;
    static int amount;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        answer = 0;
        int[] coins = {500, 100, 50, 10, 5, 1};

        amount = 1000 - scan.nextInt();

        for(int coin : coins) {
            if(isReturnExchange(coin)) {
                break;
            }
        }
        System.out.print(answer);
    }

    public static boolean isReturnExchange(int coinAmount) {
        answer += amount / coinAmount;
        amount = amount % coinAmount;

        if(amount == 0) {
            return true;
        }
        return false;
    }
}
