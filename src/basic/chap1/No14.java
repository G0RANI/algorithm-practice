package basic.chap1;

import java.util.Scanner;

public class No14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int[] inputs = new int[target];
        for(int i = 0; i<target; i++){
            inputs[i] = in.nextInt();
        }
        System.out.print(solution(target, inputs));
    }

    public static int solution(int target, int[] inputs) {
        int result = 1;
        int base = inputs[0];

        for(int i = 1; i<target; i++) {
            if(inputs[i] > base) {
                base = inputs[i];
                result ++;
            }
        }
        return result;
    }
}
