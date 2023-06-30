package programers;

public class No43 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/17681?language=java
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] firstMap = new String[n];
        String[] secondMap = new String[n];
        String format = "%0"+n+"d";
        for(int i = 0; i < arr1.length; i++) {
            firstMap[i] = String.format(format, Long.valueOf(Long.toBinaryString(arr1[i])));
            secondMap[i] = String.format(format, Long.valueOf(Long.toBinaryString(arr2[i])));
        }

        for(int i = 0; i < arr1.length; i++) {
            String[] firstAnswer = firstMap[i].split("");
            String[] secondAnswer = secondMap[i].split("");
            String totalAnswer = "";
            for(int j  = 0; j < n; j ++) {
                if(firstAnswer[j].equals("1") | secondAnswer[j].equals("1")) {
                    totalAnswer += "#";
                }else {
                    totalAnswer += " ";
                }
            }
            answer[i] = totalAnswer;
        }
        return answer;
    }
}
