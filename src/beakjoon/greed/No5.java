package beakjoon.greed;

import java.util.Scanner;

public class No5 {
    // https://www.acmicpc.net/submit/1541/63923601
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String target = scan.next();
        int answer = solution(target);
        System.out.print(answer);
    }

    public static int solution(String target) {
        int result = 0;
        String[] subtraction = target.split("-");

        for (int i = 0; i < subtraction.length; i++) {
            int temp = 0;

            String[] addition = subtraction[i].split("\\+");
            for (String add : addition) {
                temp += Integer.parseInt(add);
            }

            if (i == 0) {
                result += temp;
            } else {
                result -= temp;
            }
        }

        return result;
    }
}
