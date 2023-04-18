import java.util.Scanner;

public class No2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        System.out.println(solution(input1));
    }

    public static String solution(String input) {

        StringBuilder result = new StringBuilder();
        for(char target : input.toCharArray()) {
            String newTarget = String.valueOf(target);
            transform(result, newTarget);
        }
        return result.toString();
    }

    private static void transform(StringBuilder result,
                                  String newTarget) {
        if(isLowerCase(newTarget)) {
            result.append(newTarget.toUpperCase());
        }else {
            result.append(newTarget.toLowerCase());
        }
    }

    private static boolean isLowerCase(String newTarget) {
        return newTarget.equals(newTarget.toLowerCase());
    }
}
