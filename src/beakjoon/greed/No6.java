package beakjoon.greed;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class No6 {
    // https://www.acmicpc.net/problem/1026
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int answer = 0;

        int count = scan.nextInt();

        Integer[] a = new Integer[count];
        Integer[] b = new Integer[count];
        for(int i = 0; i < count; i++) {
            a[i] = scan.nextInt();
        }
        for(int i = 0; i < count; i++) {
            b[i] = scan.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());

        for(int i = 0; i < count; i++) {
            answer += a[i] * b[i];
        }

        System.out.print(answer);
    }
}
