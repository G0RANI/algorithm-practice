package programers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class No23 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/92334
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashSet<String> reportSet = new HashSet<>(Arrays.asList(report));
        HashMap<String, String> reportMap = new HashMap<>();
        HashMap<String, Integer> reportCountMap = new HashMap<>();

        for(String target : reportSet) {
            String[] targets = target.split(" ");
            String senderName = targets[0];
            String reportName = targets[1];
            String reportedName = reportMap.getOrDefault(targets[0], "");
            if(reportedName.equals("")) {
                reportMap.put(senderName, reportName);
            }else {
                reportMap.put(senderName, reportedName + "," + reportName);
            }
            reportCountMap.put(reportName, reportCountMap.getOrDefault(reportName, 0) + 1);
        }

        for(int i = 0 ; i < id_list.length; i++) {
            String stringReport = reportMap.get(id_list[i]);
            if(stringReport == null) {
                answer[i] = 0;
            }else {
                String[] reports = stringReport.split(",");
                for (String senderName : reports) {
                    if (reportCountMap.containsKey(senderName)) {
                        if (k <= reportCountMap.get(senderName)) answer[i] = answer[i] + 1;
                    }
                }
            }
        }

        return answer;
    }
}
