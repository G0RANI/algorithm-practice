package basic.chap1;

import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();
        System.out.println(solution(input1, input2));
    }

    public static int solution(String target,
                               String input) {
        String newTarget = target.toLowerCase();
        char newInput = input.toLowerCase().charAt(0);
        int count = 0;
        for (char tempTarget : newTarget.toCharArray()) {
            if(tempTarget == newInput) count++;
        }
        return count;
    }
}
