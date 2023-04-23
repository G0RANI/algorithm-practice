import java.util.Scanner;

public class No11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        char target = in.next().charAt(0);
        System.out.println(solution(input, target));
    }

    public static String solution(String input, char target) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] inputs = input.toCharArray();
        int[] result = new int[inputs.length];
        int count = 1000;
        for (int i = 0; i < input.length() ; i++) {
            if(inputs[i] == target) count = 0;
            result[i] = count;
            count ++;
        }

        count = 1000;
        for (int j = input.length() -1; j > -1 ; j--) {
            if(inputs[j] == target) count = 0;
            if(count < result[j])result[j] = count;
            count ++;
        }

        for (int tmp : result) {
            stringBuilder.append(tmp).append(" ");
        }
        return stringBuilder.toString();
    }
}
