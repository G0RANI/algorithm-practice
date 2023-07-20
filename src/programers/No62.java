package programers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class No62 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/43163?language=java
    HashSet<String> wordsSet;
    HashMap<String, Boolean> visited;

    public int solution(String begin, String target, String[] words) {
        wordsSet = new HashSet<>();
        visited = new HashMap<>();
        for(String word : words) {
            wordsSet.add(word);
            visited.put(word, false);
        }

        if(!wordsSet.contains(target)) return 0;

        return BFS(begin, target);
    }

    public int BFS(String begin, String target) {
        Queue<String> targetQueue = new LinkedList<>();
        targetQueue.add(begin);
        int level = 0;

        while(!targetQueue.isEmpty()) {
            int size = targetQueue.size();
            for(int j = 0; j < size; j++) {
                String currentWord = targetQueue.poll();
                if(currentWord.equals(target)) return level;

                for(int i = 0; i < currentWord.length(); i++) {
                    char[] parts = currentWord.toCharArray();

                    for(char c='a'; c<='z'; c++) {
                        parts[i] = c;
                        String nextWord = new String(parts);

                        if(wordsSet.contains(nextWord) && !visited.get(nextWord)) {
                            targetQueue.add(nextWord);
                            visited.put(nextWord, true);
                        }
                    }
                }
            }
            level++;
        }

        return 0;
    }
}
