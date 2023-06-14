package basic.chap1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No10 {

    private static List<Character> collect = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(solution(input1));
    }

    public static String solution(String input) {
        String lowerCaseInput = input.toLowerCase();
        int distance = 0;
        String result = "";
        for(char tmp : lowerCaseInput.toCharArray()){
            if(tmp == 't' || tmp == 's') {
                result = result + distance;
                distance = 0;
            } else {
                distance ++;
            }
        }
        return "";
    }
}
