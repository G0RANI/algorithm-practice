package chap2;

import java.util.Scanner;

public class No6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int[] targets = new int[input];
        for(int i = 0; i <input; i++) {
            targets[i] = in.nextInt();
        }
        for (int target : targets) {
            solution(target);
        }

    }

    public static void solution(int target) {
        int reversResult = 0;
        while (target > 0) {
            int tempRevers = target%10;
            reversResult = reversResult * 10 + tempRevers;
            target = target / 10;
        }
        if(isPrime(reversResult)) System.out.print(reversResult + " ");
    }

    private static boolean isPrime(int reversResult) {
        if (reversResult == 1) return Boolean.FALSE;

        for (int i = 2; i < reversResult; i ++) {
            if(reversResult % i == 0) return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

}
