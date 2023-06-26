package programers;

import java.util.Stack;

public class No36 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/64061
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> dollStack = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
            int target = moves[i] - 1;
            for (int j = 0; j < board.length; j++) {
                int doll = board[j][target];
                if (doll != 0) {
                    if(!dollStack.empty()){
                        if (dollStack.peek() == doll) {
                            answer += 2;
                            dollStack.pop();
                        } else {
                            dollStack.push(doll);
                        }
                    }else {
                        dollStack.push(doll);
                    }
                    board[j][target] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
