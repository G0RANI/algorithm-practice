package chap1;

import java.util.Scanner;

public class No12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String input = in.next();
        System.out.println(solution(size, input));
    }

    public static String solution(int input1, String input) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        while (count < input1) {
            String target = input.substring(count * 7, ((count + 1) * 7));
            target = target.replace("#", "1");
            target = target.replace("*", "0");
            int a = Integer.parseInt(target, 2);
            char b = (char) a;
            result.append(b);
            count++;
        }
        return result.toString();
    }
}
