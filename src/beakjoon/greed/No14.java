package beakjoon.greed;

import java.util.PriorityQueue;
import java.util.Scanner;

public class No14 {
    // https://www.acmicpc.net/problem/1715
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int deckCount = scan.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < deckCount; i++) {
            pq.offer(scan.nextInt());
        }

        int answer = 0;
        while(pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();

            int sum = first + second;
            answer += sum;

            pq.offer(sum);
        }

        System.out.print(answer);
    }
}
