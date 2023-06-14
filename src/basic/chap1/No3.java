package basic.chap1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No3 {

    private static final List<String> longestInputs = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(solution(input1));
    }

    public static String solution(String input) {
        String[] splitInputs = input.split(" ");
        for (String splitInput : splitInputs) {
            addLongestInput(splitInput);
        }
        return longestInputs.get(0);
    }

    private static void addLongestInput(String splitInput) {
        if (longestInputs.isEmpty()) {
            longestInputs.add(splitInput);
        } else {
            if (isLongerThenBefore(splitInput)) {
                addNewInput(splitInput);
            }
        }
    }

    private static void addNewInput(String splitInput) {
        longestInputs.clear();
        longestInputs.add(splitInput);
    }

    private static boolean isLongerThenBefore(String splitInput) {
        return longestInputs.get(0).length() < splitInput.length();
    }
}
