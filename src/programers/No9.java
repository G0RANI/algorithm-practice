package programers;

import java.util.HashMap;

public class No9 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/150370
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        String[] tempToday = today.split("\\.");
        int year = Integer.parseInt(tempToday[0]);
        int month = Integer.parseInt(tempToday[1]);
        int day = Integer.parseInt(tempToday[2]);

        int totalDay = day + month * 28 + year*12*28;

        HashMap<String, Integer> termMap = new HashMap<>();

        for(String term : terms) {
            String[] termParts = term.split(" ");
            String code = termParts[0];
            int period = Integer.parseInt(termParts[1]);
            termMap.put(code, period);
        }

        StringBuilder tempStringAnswer = new StringBuilder();

        for(int i = 0; i < privacies.length; i++) {
            String privacy = privacies[i];
            String[] privacyParts = privacy.split("\\.");

            int privacyYear = Integer.parseInt(privacyParts[0]);
            int privacyMonth = Integer.parseInt(privacyParts[1]);
            String[] dayAndCode = privacyParts[2].split(" ");
            int privacyDay = Integer.parseInt(dayAndCode[0]);

            String code = dayAndCode[1];
            int period = termMap.get(code);

            if(privacyMonth + period >= 12) {
                privacyYear += (privacyMonth + period) / 12;
                privacyMonth = (privacyMonth + period) % 12;
            }else {
                privacyMonth += period;
            }

            int totalPrivacyDay = privacyDay + privacyMonth * 28 + privacyYear*12*28;
            if(totalDay >= totalPrivacyDay) tempStringAnswer.append(i+1).append(",");
        }

        String[] tempAnswer = tempStringAnswer.toString().split(",");
        answer = new int[tempAnswer.length];

        for(int i = 0; i < tempAnswer.length; i++) {
            answer[i] = Integer.parseInt(tempAnswer[i]);
        }

        return answer;
    }
}
