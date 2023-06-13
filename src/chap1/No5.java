package chap1;

import java.util.Scanner;

public class No5 {

    private static String[] results;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(solution(input1));
    }

    public static String solution(String input) {
        char[] inputs = input.toCharArray();
        int size = inputs.length;
        int index = size - 1;
        results = new String[size];

        addSpecialChar(inputs, index);
        addNormalChar(inputs, index);

        StringBuilder result = new StringBuilder();
        for (String tmp : results) {
            result.append(tmp);
        }
        return result.toString();
    }

    private static void addSpecialChar(char[] inputs,
                                       int size) {
        for (int i = 0; i <= size; i++) {
            String input = String.valueOf(inputs[i]);
            if (isSpecialChar(input)) {
                results[i] = input;
            }
        }
    }

    private static void addNormalChar(char[] inputs,
                                      int size) {
        for (int i = 0; i <= size; i++) {
            String input = String.valueOf(inputs[i]);
            if (!isSpecialChar(input)) {
                addResult(input, size);
            }
        }
    }

    private static boolean isSpecialChar(String input) {
        String result = input.replaceAll("^[a-zA-Z]*$", "");
        return !result.equals("");
    }

    private static void addResult(String result,
                                  int size) {
        int i = size;
        while (i >= 0) {
            if (results[i] == null) {
                results[i] = result;
                break;
            }
            i--;
        }
    }
}
