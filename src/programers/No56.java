package programers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class No56 {
    class Process {
        int priority;
        int location;

        Process(int priority, int location) {
            this.priority = priority;
            this.location = location;
        }
    }

    public int solution(int[] priorities, int location) {
        Queue<Process> queue = new LinkedList<>();
        for(int i = 0; i < priorities.length; i++) {
            queue.offer(new Process(priorities[i], i));
        }

        Arrays.sort(priorities);
        int size = priorities.length;
        int count = 0;

        while(!queue.isEmpty()) {
            Process current = queue.poll();
            if(current.priority == priorities[size - 1 - count]) {
                count++;
                if(current.location == location) {
                    return count;
                }
            } else {
                queue.offer(current);
            }
        }

        return count;
    }
}
