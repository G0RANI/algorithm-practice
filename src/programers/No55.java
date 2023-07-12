package programers;

import java.util.Stack;

public class No55 {
    boolean solution(String s) {
        Stack<Character> bracketStack = new Stack<>();
        for(char bracket : s.toCharArray()) {
            if(bracket == '(') {
                bracketStack.push(bracket);
            } else {
                if(bracketStack.isEmpty()) {
                    return false;
                }
                bracketStack.pop();
            }
        }
        return bracketStack.isEmpty();
    }
}
