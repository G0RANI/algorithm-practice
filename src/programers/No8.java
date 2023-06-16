package programers;

import java.util.Arrays;
import java.util.HashMap;

public class No8 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/155652
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        String[] alphabet = {"a", "b" ,"c" ,"d" ,"e" ,"f" ,"g" ,"h" ,"i" ,"j" ,"k" ,"l" ,"m" ,"n" ,"o" ,"p" ,"q" ,"r" ,"s" ,"t" ,"u" ,"v" ,"w" ,"x" ,"y" ,"z"};
        String[] sortedSkip = skip.split("");
        HashMap<String, Integer> keyAlphabet = new HashMap<>();
        HashMap<Integer, String> keyIndex = new HashMap<>();
        int removePoint = 0;
        int keyAlphabetIndex = 0;
        Arrays.sort(sortedSkip);
        for(int i = 0; i < alphabet.length; i++) {
            if(removePoint < sortedSkip.length && !sortedSkip[removePoint].equals(alphabet[i])){
                keyAlphabet.put(alphabet[i], keyAlphabetIndex);
                keyIndex.put(keyAlphabetIndex, alphabet[i]);
                keyAlphabetIndex++;
            } else if(removePoint == sortedSkip.length) {
                keyAlphabet.put(alphabet[i], keyAlphabetIndex);
                keyIndex.put(keyAlphabetIndex, alphabet[i]);
                keyAlphabetIndex++;
            }else {
                removePoint ++;
            }
        }

        String[] targets = s.split("");

        for(String target : targets) {
            int targetIndex = keyAlphabet.get(target) + index;
            if(targetIndex <= keyAlphabetIndex - 1) {
                answer.append( keyIndex.get(targetIndex));
            } else {
                answer.append(keyIndex.get(targetIndex%keyAlphabetIndex));
            }
        }

        return answer.toString();
    }
}
