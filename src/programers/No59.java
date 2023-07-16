package programers;

public class No59 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/43165?language=java
    static boolean[] isVisited;
    static int answer = 0;

    public int solution(int[] numbers, int target) {
        isVisited = new boolean[numbers.length];
        DFS(numbers, 0, target);
        return answer;
    }

    public void DFS(int[] numbers, int point, int target) {
        if(point == numbers.length) {
            int sum = 0;
            for(int i = 0; i < isVisited.length; i++) {
                if(isVisited[i]) {
                    sum = sum + numbers[i];
                }else {
                    sum = sum - numbers[i];
                }
            }
            if(sum == target) answer++;
        }else {
            isVisited[point] = true;
            DFS(numbers, point + 1, target);
            isVisited[point] = false;
            DFS(numbers, point + 1, target);
        }
    }
}
