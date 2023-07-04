package programers;

import java.util.Arrays;

public class No49 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42577
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i = 1; i < phone_book.length; i++) {
            if(phone_book[i].startsWith(phone_book[i-1])) return false;
        }
        return answer;
    }
}
