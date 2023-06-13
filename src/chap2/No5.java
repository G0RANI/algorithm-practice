package chap2;

import java.util.Scanner;

public class No5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println(solution(input));
    }

    public static int solution(int input) {
        int answer = 0;
        int[] inputs = new int[input + 1];
        for(int i = 2; i <=input; i++) {
            if(inputs[i] == 0) {
                answer++;
                for(int j = i; j <= input; j = j + i) {
                    inputs[j] = 1;
                }
            }
        }
        return answer;
    }

}
