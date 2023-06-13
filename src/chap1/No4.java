package chap1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No4 {

    private static final List<String> inputs = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        while (input > 0) {
            input--;
            inputs.add(in.next());
        }
        for (String input2 : inputs) {
            System.out.println(solution(input2));
        }

    }

    public static String solution(String input) {
        StringBuilder result = new StringBuilder();
        int lenth = input.length();
        char[] chars = input.toCharArray();
        while (lenth > 0) {
            char a = chars[lenth-1];
            result.append(a);
            lenth--;
        }
        return result.toString();
    }
}
