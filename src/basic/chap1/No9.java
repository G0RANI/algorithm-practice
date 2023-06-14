package basic.chap1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class No9 {
    private static List<Character> collect = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(solution(input1));
    }

    public static Integer solution(String input) {
        for(char tmp : input.toCharArray()){
           collect.add(tmp);
        }
        String result = collect.stream().filter(character -> !Character.isAlphabetic(character)).map(String::valueOf).collect(Collectors.joining());
        return Integer.parseInt(result);
    }
}
