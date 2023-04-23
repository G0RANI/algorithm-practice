import java.util.Scanner;

public class No7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(solution(input1));
    }

    public static String solution(String input) {
        String lowerCaseInput = input.toLowerCase();
        char[] arrTmp = lowerCaseInput.toCharArray();
        int lt = 0;
        int rt = arrTmp.length - 1;
        while (lt<rt) {
            char cTmp = arrTmp[lt];
            arrTmp[lt] = arrTmp[rt];
            arrTmp[rt] = cTmp;
            lt ++;
            rt --;
        }
        String resut = String.valueOf(arrTmp);
        if(resut.equals(lowerCaseInput)) return "YES";
        return "NO";
    }
}
