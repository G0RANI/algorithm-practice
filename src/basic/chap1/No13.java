package basic.chap1;

import java.util.ArrayList;
import java.util.Scanner;

public class No13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int[] inputs = new int[target];
        for(int i = 0; i<target; i++){
            inputs[i] = in.nextInt();
        }
        for(int input : solution(target, inputs)) {
            System.out.print(input + " ");
        }

    }

    public static ArrayList<Integer> solution(int target, int[] inputs) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(inputs[0]);
        for(int i = 1; i<target; i++) {
            if(inputs[i] > inputs[i - 1]) {
                result.add(inputs[i]);
            }
        }
        return result;
    }
}
