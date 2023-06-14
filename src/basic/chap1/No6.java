package basic.chap1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class No6 {

    private static List<String> collect = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(solution(input1));
    }

    public static String solution(String input) {
        for(char tmp : input.toCharArray()) {
            collect.add(String.valueOf(tmp));
        }
        return collect.stream().distinct().collect(Collectors.joining());
    }
}
