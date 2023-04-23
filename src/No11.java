import java.util.Arrays;
import java.util.Scanner;

public class No11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        char target = in.next().charAt(0);
        System.out.println(solution(input, target));
    }

    public static String solution(String input, char target) {
        char[] inputs = input.toCharArray();
        int[] result = new int[inputs.length];
        int count = 1000;
        for (int i = 0; i < input.length() ; i++) {
            if(inputs[i] == target) count = 0;
            result[i] = count;
            count ++;
        }

        for (int j = input.length() -1; j > -1 ; j--) {
            if(inputs[j] == target) count = 0;
            result[j] = count;
            count ++;
        }
        return Arrays.toString(result);
    }
}
