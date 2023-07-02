import java.util.*;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] answer = new String[names.length];
        TreeMap<Integer, String> heightsMap = new TreeMap<>(Collections.reverseOrder());
        for(int i = 0; i < names.length; i++) {
            heightsMap.put(heights[i], names[i]);
        }

        int point = 0;
        for(String name : heightsMap.values()) {
            answer[point] = name;
            point++;
        }

        return answer;
    }
}